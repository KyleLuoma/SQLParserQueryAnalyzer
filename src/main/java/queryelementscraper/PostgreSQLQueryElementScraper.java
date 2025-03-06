package queryelementscraper;

import postgressql.PostgreSQLParser;
import postgressql.PostgreSQLLexer;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;


import java.util.ArrayList;
import java.util.ListIterator;

import javax.management.Query;

public class PostgreSQLQueryElementScraper extends QueryElementScraper{

    private PostgreSQLLexer lexer;
    private CommonTokenStream tokens;
    private PostgreSQLParser parser;
    private PostgreSQLScraperListener listener;
    private ParseTreeWalker walker;
    private ArrayList<ArrayList<String>> queryElements;

    public PostgreSQLQueryElementScraper(String query) {
        super(query);
        this.doNewQuery(query);
    }

    @Override
    public void doNewQuery(String query) {
        this.lexer = new PostgreSQLLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(this.lexer);
        this.parser = new PostgreSQLParser(tokens);
        this.listener = new PostgreSQLScraperListener();
        this.walker = new ParseTreeWalker();
        this.queryElements = this.scrapeQuery();
    }


    @Override
    public ArrayList<ArrayList<String>> scrapeQuery() {
        this.parser.reset();
        this.walker.walk(this.listener, this.parser.root());
        ArrayList<ArrayList<String>> elements = new ArrayList<>();
        ArrayList<String> aliases = new ArrayList<>();
        while(!this.listener.stack.isEmpty()) {
            ArrayList<String> currentItem = this.listener.stack.pop();
            if(currentItem.get(0).endsWith("alias")) {
                aliases.add(currentItem.get(1));
            }
            elements.add(currentItem);
        }
        elements.removeIf(
            element -> !element.get(0).endsWith("alias") && aliases.contains(element.get(1))
            );

        return elements;
    }

    @Override
    public void printParseTree() {
        this.parser.reset();
        System.out.println(
                this.parser.stmt().toStringTree(this.parser)
        );
    }

    @Override
    public ArrayList<ArrayList<String>> getQueryElements() {
        return this.queryElements;
    }

    @Override
    public String getQueryElementsAsJsonString() {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("[");
        ListIterator<ArrayList<String>> elemIter = this.queryElements.listIterator();
        while(elemIter.hasNext()) {
            ArrayList<String> tempPair = elemIter.next();
            jsonString.append("\n    {\"" + tempPair.get(0) + "\" : \"" + tempPair.get(1) + "\"}");
            if (elemIter.hasNext()) {
                jsonString.append(",");
            }
        }
        jsonString.append("\n]");
        return jsonString.toString();
    }

}
