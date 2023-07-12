package queryelementscraper;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tsql.TSqlLexer;
import tsql.TSqlParser;

import java.util.ArrayList;
import java.util.ListIterator;

public class QueryElementScraper {

    private TSqlLexer lexer;
    private CommonTokenStream tokens;
    private TSqlParser parser;
    private TSqlScraperVisitor visitor;
    private ParseTreeWalker walker;
    private ArrayList<ArrayList<String>> queryElements;


    public QueryElementScraper(String query) {
        this.doNewQuery(query);
    }

    public void doNewQuery(String query) {
        this.lexer = new TSqlLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(this.lexer);
        this.parser = new TSqlParser(this.tokens);
        this.visitor = new TSqlScraperVisitor();
//        this.walker = new ParseTreeWalker();
        queryElements = this.scrapeQuery();
    }

    private ArrayList<ArrayList<String>> scrapeQuery() {
        this.parser.reset();
        ArrayList<ArrayList<String>> elements
                = (ArrayList<ArrayList<String>>) visitor.visit(this.parser.query_expression());
        return elements;
    }

    public void printParseTree() {
        this.parser.reset();
        System.out.println(
                this.parser.select_statement_standalone().toStringTree(this.parser)
        );
    }

    public ArrayList<ArrayList<String>> getQueryElements() {
        return this.queryElements;
    }

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
