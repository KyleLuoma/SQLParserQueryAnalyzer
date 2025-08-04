package queryelementscraper;

import org.antlr.v4.runtime.tree.TerminalNode;

import postgressql.PostgreSQLParser;
import postgressql.PostgreSQLParserBaseListener;

import java.util.ArrayList;
import java.util.Stack;

public class PostgreSQLScraperListener extends PostgreSQLParserBaseListener{
    Stack<ArrayList<String>> stack = new Stack<>();
    Boolean inWhereClause = false;
    String whereClauseColumnref = "";

    public void enterWhere_clause(PostgreSQLParser.Where_clauseContext ctx) {
        inWhereClause = true;
    }

    public void exitWhere_clause(PostgreSQLParser.Where_clauseContext ctx) {
        inWhereClause = false;
    }

    public void enterA_expr_in(PostgreSQLParser.A_expr_inContext ctx) {
        if (ctx.in_expr() != null) {
            String columnName = ctx.a_expr_unary_not().getText();
            if (ctx.in_expr().expr_list() != null) {
                for (int i = 0; i < ctx.in_expr().expr_list().a_expr().size(); i++) {
                    ArrayList<String> addItem = new ArrayList<>();
                    addItem.add("predicatecolumn " + columnName);
                    addItem.add("predicatevalue " + ctx.in_expr().expr_list().a_expr(i).getText());
                    stack.push(addItem);
                }
            }
        }
    }

    public void enterA_expr_compare(PostgreSQLParser.A_expr_compareContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        if (ctx.a_expr_like().size() == 2) {
            addItem.add("predicatecolumn " + ctx.a_expr_like(0).getText());
            addItem.add("predicatevalue " + ctx.a_expr_like(1).getText());
            stack.push(addItem);
        }        
    }

    public void enterA_expr_like(PostgreSQLParser.A_expr_likeContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        if (ctx.a_expr_qual_op().size() == 2) {
            addItem.add("predicatecolumn "  + ctx.a_expr_qual_op(0).getText());
            addItem.add("predicatevalue " + ctx.a_expr_qual_op(1).getText());
            stack.push(addItem);
        }
    }

    public void enterColumnref(PostgreSQLParser.ColumnrefContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
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
        if (inWhereClause) {
            whereClauseColumnref = columnName;
        } else {
            addItem.add("column");
            addItem.add(columnName);
            if(!columnName.equals("none")) {
                stack.push(addItem);
            }
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
        if (tableName.startsWith(".")) {
            tableName = tableName.substring(1);
        }
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
