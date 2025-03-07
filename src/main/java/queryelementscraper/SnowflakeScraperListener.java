package queryelementscraper;

import java.util.ArrayList;
import java.util.Stack;

import snowflake.SnowflakeParser;
import snowflake.SnowflakeParserBaseListener;
import snowflake.SnowflakeParser.ExprContext;

public class SnowflakeScraperListener extends SnowflakeParserBaseListener{
    Stack<ArrayList<String>> stack = new Stack<>();
    Boolean inPredicate = false;

    public void enterColumn_elem(SnowflakeParser.Column_elemContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("column");
        addItem.add(ctx.getText());
        stack.push(addItem);
    }

    public void enterProjection_alias(SnowflakeParser.Projection_aliasContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("column alias");
        addItem.add(ctx.as_alias().alias().getText());
        stack.push(addItem);
    }

    public void enterTable_object_name(SnowflakeParser.Table_object_nameContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("table");
        addItem.add(ctx.getText());
        stack.push(addItem);
    }

    public void enterRelation_alias(SnowflakeParser.Relation_aliasContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        addItem.add("table alias");
        addItem.add(ctx.as_alias().alias().getText());
        stack.push(addItem);
    }

    public void enterFunction_call(SnowflakeParser.Function_callContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        if(ctx.expr_list() != null && ctx.expr_list().expr() != null) {
            for(int i = 0; i < ctx.expr_list().expr().size(); i++){
                if(ctx.expr_list().expr(i).primitive_expression() != null){
                    addItem.add("column");
                    addItem.add(ctx.expr_list().expr(i).primitive_expression().getText());
                    stack.push(addItem);
                }
            }
        }
    }

    public void enterAggregate_function(SnowflakeParser.Aggregate_functionContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        if(ctx.expr_list() != null) {
            for(int i = 0; i < ctx.expr_list().expr().size(); i++){
                if(ctx.expr_list().expr(i).primitive_expression() != null){
                    addItem.add("column");
                    addItem.add(ctx.expr_list().expr(i).primitive_expression().getText());
                    stack.push(addItem);
                }
            }
        } else if(ctx.expr() != null) {
            addItem.add("column");
            addItem.add(ctx.expr().getText());
            stack.push(addItem);
        }
    }

    public void enterFlatten_table(SnowflakeParser.Flatten_tableContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        if(ctx.expr().primitive_expression() != null){
            addItem.add("column");
            addItem.add(ctx.expr().primitive_expression().getText());
            stack.push(addItem);
        }
    }

    public void enterPredicate(SnowflakeParser.PredicateContext ctx) {
        inPredicate = true;
    }

    public void enterExpr(SnowflakeParser.ExprContext ctx) {
        ArrayList<String> addItem = new ArrayList<>();
        if(inPredicate && ctx.primitive_expression() != null){
            addItem.add("column");
            if(ctx.primitive_expression().full_column_name() != null){
                addItem.add(ctx.primitive_expression().full_column_name().getText());
            } else if(ctx.primitive_expression().id_().size() > 0){
                addItem.add(ctx.primitive_expression().id_().get(ctx.primitive_expression().id_().size() - 1).getText());
            }
            if(addItem.size() == 2){
                stack.push(addItem);
            }
        }
    }

    public void exitPredicate(SnowflakeParser.PredicateContext ctx) {
        inPredicate = false;
    }

}
