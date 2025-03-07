package queryelementscraper;

import snowflake.SnowflakeLexer;
import snowflake.SnowflakeParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

import java.util.ArrayList;
import java.util.ListIterator;

public class SnowflakeQueryElementScraper extends QueryElementScraper{

    private SnowflakeLexer lexer;
    private CommonTokenStream tokens;
    private SnowflakeParser parser;
    private SnowflakeScraperListener listener;
    private ParseTreeWalker walker;
    private ArrayList<ArrayList<String>> queryElements;

    public SnowflakeQueryElementScraper(String query) {
        super(query);
        this.doNewQuery(query);
    }

    @Override
    public void doNewQuery(String query) {
        this.lexer = new SnowflakeLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(lexer);
        this.parser = new SnowflakeParser(tokens);
        this.listener = new SnowflakeScraperListener();
        this.walker = new ParseTreeWalker();
        this.queryElements = this.scrapeQuery();
    }

    @Override
    public ArrayList<ArrayList<String>> scrapeQuery() {
        this.parser.reset();
        this.walker.walk(this.listener, this.parser.snowflake_file());
        ArrayList<ArrayList<String>> elements = new ArrayList<>();
        ArrayList<String> aliases = new ArrayList<>();
        while(!this.listener.stack.isEmpty()) {
            ArrayList<String> currentItem = this.listener.stack.pop();
            if(currentItem.get(0).endsWith("alias")) {
                aliases.add(currentItem.get(1));
            }
            currentItem.set(1, currentItem.get(1).replace("\"", ""));
            if(currentItem.get(0).equals("column") && currentItem.get(1).contains(".")) {
                String[] parts = currentItem.get(1).split("\\.");
                currentItem.set(1, parts[parts.length - 1]);
            }
            if(currentItem.get(1).length() > 0){
                elements.add(currentItem);
            }
        }
        // elements.removeIf(
        //     element -> !element.get(0).endsWith("alias") && aliases.contains(element.get(1))
        //     );

        return elements;
    }

    @Override
    public void printParseTree() {
        this.parser.reset();
        System.out.println(
                this.parser.query_statement().toStringTree(this.parser)
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
