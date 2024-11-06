package queryelementscraper;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sqlite.SQLiteParser;
import sqlite.SQLiteLexer;

import java.util.ArrayList;
import java.util.ListIterator;

public class SQliteQueryElementScraper extends QueryElementScraper{

    private SQLiteLexer lexer;
    private CommonTokenStream tokens;
    private SQLiteParser parser;
    private SQliteScraperVisitor visitor;
    private ParseTreeWalker walker;
    private ArrayList<ArrayList<String>> queryElements;

    public SQliteQueryElementScraper(String query) {
        super(query);
        this.doNewQuery(query);
    }

    @Override
    public void doNewQuery(String query) {
        this.lexer = new SQLiteLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(this.lexer);
        this.parser = new SQLiteParser(this.tokens);
        this.visitor = new SQliteScraperVisitor();
//        this.walker = new ParseTreeWalker();
        this.queryElements = this.scrapeQuery();
    }

    @Override
    public ArrayList<ArrayList<String>> scrapeQuery() {
        this.parser.reset();
        ArrayList<ArrayList<String>> elements
                = (ArrayList<ArrayList<String>>) visitor.visit(this.parser.select_stmt());
        return elements;
    }

    @Override
    public void printParseTree() {
        this.parser.reset();
        System.out.println(
                this.parser.select_stmt().toStringTree(this.parser)
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
