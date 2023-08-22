package queryschemaidentifiertagger;

import org.antlr.v4.runtime.tree.TerminalNode;
import tsql.TSqlParser;
import tsql.TSqlParserBaseListener;

import java.util.Stack;

public class TSqlRenamerListener extends TSqlParserBaseListener {

    Stack<String> stack = new Stack<String>();
    Stack<String> tableAliases = new Stack<>();
    Stack<String> columnAliases = new Stack<>();

    public void visitTerminal(TerminalNode node) {
        stack.push(node.getText());
    }

    public void enterColumn_name(TSqlParser.Column_nameContext ctx){
        stack.push("<COLUMN_NAME>");
    }

    public void exitColumn_name(TSqlParser.Column_nameContext ctx){
        stack.push("</COLUMN_NAME>");
    }


    public void enterFull_table_name(TSqlParser.Full_table_nameContext ctx){
        stack.push("<TABLE_NAME>");
    }

    public void exitFull_table_name(TSqlParser.Full_table_nameContext ctx){
        stack.push("</TABLE_NAME>");
    }

    public void enterTable_alias(TSqlParser.Table_aliasContext ctx){
        tableAliases.push(ctx.getText());
    }

    public void enterColumn_alias(TSqlParser.Column_aliasContext ctx){
        columnAliases.push(ctx.getText());
    }

}
