package queryelementscraper;

import java.util.ArrayList;
import java.util.Stack;

import snowflake.SnowflakeParser;
import snowflake.SnowflakeParserBaseListener;

public class SnowflakeScraperListener extends SnowflakeParserBaseListener{
    Stack<ArrayList<String>> stack = new Stack<>();

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

}
