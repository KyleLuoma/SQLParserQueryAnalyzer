package queryelementscraper;

import org.antlr.v4.runtime.tree.TerminalNode;

import postgressql.PostgreSQLParser;
import postgressql.PostgreSQLParserBaseListener;

import java.util.ArrayList;
import java.util.Stack;

public class PostgreSQLScraperListener extends PostgreSQLParserBaseListener{
    Stack<ArrayList<String>> stack = new Stack<>();
    Stack<String> tableAliases = new Stack<>();
    Stack<String> columnAliases = new Stack<>();


    public void enterColumnref(PostgreSQLParser.ColumnrefContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("column");
        String columnName;
        if (
            ctx.indirection() != null 
            && ctx.indirection().indirection_el().size() > 0
            ) {
            int numIndirections = ctx.indirection().indirection_el().size();
            if(ctx.indirection().indirection_el(numIndirections - 1).attr_name() != null){
                columnName = ctx.indirection().indirection_el(numIndirections - 1).attr_name().getText();
            } else {
                columnName = "none";
            }
            
        } else {
            columnName = ctx.colid().getText();
        }
        columnName = columnName.replace("\"", "");
        columnName = columnName.replace("`", "");
        addItem.add(columnName);
        if(!columnName.equals("none")) {
            stack.push(addItem);
        }
    }

    public void enterTable_ref(PostgreSQLParser.Table_refContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("table");
        String tableName;
        if (
            ctx.relation_expr() != null
            && ctx.relation_expr().qualified_name() != null
            && ctx.relation_expr().qualified_name().indirection() != null
            && ctx.relation_expr().qualified_name().indirection().indirection_el().size() > 0
            ) {
                int numIndirections = ctx.relation_expr()
                                            .qualified_name()
                                            .indirection()
                                            .indirection_el()
                                            .size();
                tableName = ctx.relation_expr()
                                            .qualified_name()
                                            .indirection()
                                            .indirection_el(numIndirections - 1)
                                            .getText();
            } else if (
                ctx.relation_expr() != null 
                && ctx.relation_expr().qualified_name() != null
            ) {
                tableName = ctx.relation_expr().qualified_name().getText();
            } else {
                tableName = "none";
            }
        tableName = tableName.replace("\"", "");
        tableName = tableName.replace("`", "");
        addItem.add(tableName);
        if(!tableName.equals("none")){
            stack.push(addItem);
        }
    }

    public void enterAlias_clause(PostgreSQLParser.Alias_clauseContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("table alias");
        String alias = ctx.colid().getText();
        addItem.add(alias);
        stack.push(addItem);
    }

    public void enterTarget_el_alias(PostgreSQLParser.Target_el_aliasContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("column alias");
        String alias = ctx.getText();
        addItem.add(alias);
        stack.push(addItem);
    }

    public void enterCommon_table_expr(PostgreSQLParser.Common_table_exprContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("cte alias");
        String alias = ctx.name().getText();
        addItem.add(alias);
        stack.push(addItem);
    }

}
