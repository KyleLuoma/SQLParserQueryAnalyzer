package queryelementscraper;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tsql.TSqlLexer;
import tsql.TSqlParser;

import java.util.ArrayList;
import java.util.ListIterator;

public abstract class QueryElementScraper {

    private ArrayList<ArrayList<String>> queryElements;

    public QueryElementScraper(String query){}

    public abstract void doNewQuery(String query);

    public abstract ArrayList<ArrayList<String>> scrapeQuery();

    public abstract void printParseTree();

    public abstract ArrayList<ArrayList<String>> getQueryElements();

    public abstract String getQueryElementsAsJsonString();
}
