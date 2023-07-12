package queryelementscraper;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tsql.TSqlLexer;
import tsql.TSqlParser;

import java.util.ArrayList;
import java.util.ListIterator;

public class QueryElementScraper {

    private final TSqlLexer lexer;
    private final CommonTokenStream tokens;
    private final TSqlParser parser;
    private final TSqlScraperVisitor visitor;
    private final ParseTreeWalker walker;

    public QueryElementScraper(String query) {
        this.lexer = new TSqlLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(this.lexer);
        this.parser = new TSqlParser(this.tokens);
        this.visitor = new TSqlScraperVisitor();
        this.walker = new ParseTreeWalker();
    }

    public void scrapeQuery() {
        this.parser.reset();
        ArrayList<ArrayList<String>> elements
                = (ArrayList<ArrayList<String>>) visitor.visit(this.parser.query_expression());
        ListIterator<ArrayList<String>> elemIter = elements.listIterator();
        while(elemIter.hasNext()){
            ArrayList<String> tempPair = elemIter.next();
            System.out.println(tempPair.get(0) + ": " + tempPair.get(1));
        }
    }

    public void printParseTree() {
        System.out.println(
                this.parser.select_statement_standalone().toStringTree(this.parser)
        );
    }
}
