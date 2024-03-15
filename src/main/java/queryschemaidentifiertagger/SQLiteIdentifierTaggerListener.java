package queryschemaidentifiertagger;

import org.antlr.v4.runtime.tree.TerminalNode;
import sqlite.SQLiteParser;
import sqlite.SQLiteParserBaseListener;
import java.util.Stack;


public class SQLiteIdentifierTaggerListener  extends SQLiteParserBaseListener{
    Stack<String> stack = new Stack<String>();
    Stack<String> tableAliases = new Stack<>();
    Stack<String> columnAliases = new Stack<>();

    public void visitTerminal(TerminalNode node) {
        stack.push(node.getText());
    }

    public void enterColumn_name(SQLiteParser.Column_nameContext ctx){
        stack.push("<COLUMN_NAME>");
    }

    public void exitColumn_name(SQLiteParser.Column_nameContext ctx){
        stack.push("</COLUMN_NAME>");
    }

    public void enterTable_name(SQLiteParser.Table_nameContext ctx){
        stack.push("<TABLE_NAME>");
    }

    public void exitTable_name(SQLiteParser.Table_nameContext ctx){
        stack.push("</TABLE_NAME>");
    }

    public void enterTable_alias(SQLiteParser.Table_aliasContext ctx){
        tableAliases.push(ctx.getText());
    }

    public void enterColumn_alias(SQLiteParser.Column_aliasContext ctx) {
        columnAliases.push(ctx.getText());
    }
}
