package queryschemaidentifiertagger;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tsql.TSqlLexer;
import tsql.TSqlParser;

import java.util.Stack;

public class QuerySchemaIdentifierTagger {

    private TSqlLexer lexer;
    private CommonTokenStream tokens;
    private TSqlParser parser;
    private TSqlRenamerListener listener;
    private ParseTreeWalker walker;

    public QuerySchemaIdentifierTagger(String query) {
        this.lexer = new TSqlLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(this.lexer);
        this.parser = new TSqlParser(this.tokens);
        this.listener = new TSqlRenamerListener();
        this.walker = new ParseTreeWalker();
        this.walker.walk(this.listener, this.parser.select_statement());
    }

    public void printQueryString() {
        Stack<String> reverseStack = new Stack<String>();
        while(!this.listener.stack.isEmpty()){
            reverseStack.push(this.listener.stack.pop());
        }
        StringBuilder queryStringBuilder = new StringBuilder();
        while(!reverseStack.isEmpty()) {
            queryStringBuilder.append(reverseStack.pop());
            queryStringBuilder.append(" ");
        }
        System.out.println(queryStringBuilder);
    }

    public void printAliasString() {
        StringBuilder aliasStringBuilder = new StringBuilder();

        if(!this.listener.columnAliases.isEmpty()) {
            aliasStringBuilder.append("<COLUMN_ALIASES>");
            while(!this.listener.columnAliases.isEmpty()){
                aliasStringBuilder.append(this.listener.columnAliases.pop());
                aliasStringBuilder.append(",");
            }
            aliasStringBuilder.deleteCharAt(aliasStringBuilder.length() - 1);
            aliasStringBuilder.append("</COLUMN_ALIASES>");
        }

        if(!this.listener.tableAliases.isEmpty()) {
            aliasStringBuilder.append("<TABLE_ALIASES>");
            while (!this.listener.tableAliases.isEmpty()) {
                aliasStringBuilder.append(this.listener.tableAliases.pop());
                aliasStringBuilder.append(",");
            }
            aliasStringBuilder.deleteCharAt(aliasStringBuilder.length() - 1);
            aliasStringBuilder.append("</TABLE_ALIASES>");
        }

        System.out.println(aliasStringBuilder);
    }

}
