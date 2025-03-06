package queryelementscraper;

import sqlite.SQLiteParser;
import sqlite.SQLiteParserBaseVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SQliteScraperVisitor
        extends SQLiteParserBaseVisitor<ArrayList<ArrayList<String>>>{
	
	

    public ArrayList<ArrayList<String>> visitSelect_stmt(
            SQLiteParser.Select_stmtContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        for(int i = 0; i < ctx.select_core().size(); i++){
            container.addAll(
                    visit(ctx.select_core(i))
            );
        }
        if (ctx.order_by_stmt() != null){
            ArrayList<String> obLabel = new ArrayList<>();
            obLabel.add("order by");
            obLabel.add("1");
            container.add(obLabel);
            container.addAll(
                    visit(ctx.order_by_stmt())
            );
        }
        if (ctx.limit_stmt() != null){
            ArrayList<String> limLabel = new ArrayList<>();
            limLabel.add("limit clause");
            limLabel.add("1");
            container.add(limLabel);
            container.addAll(visit(ctx.limit_stmt()));
        }

        if (ctx.common_table_stmt() != null){
            container.addAll(visit(ctx.common_table_stmt()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitCommon_table_stmt(
            SQLiteParser.Common_table_stmtContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> cteLabel = new ArrayList<>();
        cteLabel.add("cte");
        cteLabel.add("1");
        container.add(cteLabel);
        for(int i = 0; i < ctx.common_table_expression().size(); i++){
            container.addAll(visit(ctx.common_table_expression(i)));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitCommon_table_expression(
            SQLiteParser.Common_table_expressionContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        container.addAll(visit(ctx.select_stmt()));
        ArrayList<String> cteTable = new ArrayList<>();
        cteTable.add("cte table alias");
        cteTable.add(ctx.table_name().getText());
        container.add(cteTable);
        return container;
    }

    public ArrayList<ArrayList<String>> visitSelect_core(
            SQLiteParser.Select_coreContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.where_expr() != null){
            ArrayList<String> whereLabel = new ArrayList<>();
            whereLabel.add("where");
            whereLabel.add("1");
            container.add(whereLabel);
            container.addAll(visit(ctx.where_expr().expr()));
        }
        if(ctx.having_expr() != null){
            ArrayList<String> havingLabel = new ArrayList<>();
            havingLabel.add("having");
            havingLabel.add("1");
            container.add(havingLabel);
            container.addAll(visit(ctx.having_expr().expr()));
        }
        if(ctx.group_by_expr() != null){
            ArrayList<String> gbLabel = new ArrayList<>();
            gbLabel.add("group by");
            gbLabel.add("1");
            container.add(gbLabel);
            for(int i = 0; i < ctx.group_by_expr().expr().size(); i++){
                container.addAll(
                        visit(ctx.group_by_expr().expr(i))
                );
            }
        }
        if(ctx.table_or_subquery().size() > 1){
            for(int i = 1; i < ctx.table_or_subquery().size(); i++){
                ArrayList<String> nonAnsiLabel = new ArrayList<>();
                nonAnsiLabel.add("non ansi join");
                nonAnsiLabel.add("1");
                container.add(nonAnsiLabel);
            }
        }
        for(int i = 0; i < ctx.result_column().size(); i++){
            container.addAll(visit(ctx.result_column(i)));
        }
        for(int i = 0; i < ctx.table_or_subquery().size(); i++){
            container.addAll(visit(ctx.table_or_subquery(i)));
        }
        if(ctx.join_clause() != null){
            container.addAll(visit(ctx.join_clause()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitResult_column(
            SQLiteParser.Result_columnContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("select element");
        pair.add("1");
        container.add(pair);

        if(ctx.asterisk() != null) {
            ArrayList<String> astLabel = new ArrayList<>();
            astLabel.add("asterisk");
            astLabel.add("1");
            container.add(astLabel);
        }

        if(ctx.expr() != null){
            container.addAll(visit(ctx.expr()));
        }

        return container;
    }

    public ArrayList<ArrayList<String>> visitTable_or_subquery(
            SQLiteParser.Table_or_subqueryContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();

        ArrayList<String> label_pair = new ArrayList<>();
        label_pair.add("table source item");
        label_pair.add("1");
        container.add(label_pair);

        if(ctx.table_name() != null){
            container.addAll(visit(ctx.table_name()));
        }
        if(ctx.table_or_subquery() != null){
            for(int i = 0; i < ctx.table_or_subquery().size(); i++){
                container.addAll(
                        visit(ctx.table_or_subquery(i))
                );
            }
        }
        if(ctx.join_clause() != null){
            container.addAll(visit(ctx.join_clause()));
        }
        if(ctx.subquery() != null){
            ArrayList<String> sqPair = new ArrayList<>();
            sqPair.add("subquery");
            sqPair.add("1");
            container.add(sqPair);
            container.addAll(visit(ctx.subquery().select_stmt()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitJoin_clause(
            SQLiteParser.Join_clauseContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        for(int i = 0; i < ctx.table_or_subquery().size(); i++){
            container.addAll(visit(ctx.table_or_subquery(i)));
        }
        if(ctx.join_operator() != null){
            for(int i = 0; i < ctx.join_operator().size(); i++){
                if(ctx.join_operator(i).non_ansi_join_operator() != null){
                    ArrayList<String> nonAnsiLabel = new ArrayList<>();
                    nonAnsiLabel.add("non ansi join");
                    nonAnsiLabel.add("1");
                    container.add(nonAnsiLabel);
                } else {
                    ArrayList<String> joinLabel = new ArrayList<>();
                    joinLabel.add("join");
                    joinLabel.add("1");
                    container.add(joinLabel);
                }
            }
        }
        if(ctx.join_constraint() != null){
            for(int i = 0; i < ctx.join_constraint().size(); i++){
                container.addAll(visit(ctx.join_constraint(i)));
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitJoin_constraint(
            SQLiteParser.Join_constraintContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.expr() != null){
            if(ctx.expr().predicate_or() != null || ctx.expr().predicate_and() != null){
                ArrayList<String> ckPair = new ArrayList<>();
                ckPair.add("composite-key-join");
                ckPair.add("1");
                container.add(ckPair);
            }
            container.addAll(visit(ctx.expr()));
        }
        if(ctx.column_name() != null){
            for(int i = 0; i < ctx.column_name().size(); i++){
                container.addAll(visit(ctx.column_name(i)));
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitOrder_by_stmt(
            SQLiteParser.Order_by_stmtContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        for(int i = 0; i < ctx.ordering_term().size(); i++){
            container.addAll(
                    visit(ctx.ordering_term(i).expr())
            );
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitLimit_stmt(
            SQLiteParser.Limit_stmtContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        for(int i = 0; i < ctx.expr().size(); i++){
            container.addAll(visit(ctx.expr(i)));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitExpr(
            SQLiteParser.ExprContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.table_name() != null){
            container.addAll(
                    visit(ctx.table_name())
            );
        }
        if(ctx.column_name() != null){
            container.addAll(
                    visit(ctx.column_name())
            );
        }
        if(ctx.function_name() != null){
            container.addAll(
                    visit(ctx.function_name())
            );
        }
        if(ctx.select_stmt() != null){
            container.addAll(
                    visit(ctx.select_stmt())
            );
        }
        if(ctx.table_name() != null){
            container.addAll(visit(ctx.table_name()));
        }
        if(ctx.negation() != null || (
                ctx.unary_operator() != null &&
                ctx.unary_operator().negation() != null
        )){
            ArrayList<String> pair = new ArrayList<>();
            pair.add("negation");
            pair.add("1");
            container.add(pair);
        }
        if(ctx.predicate_operator() != null){
            ArrayList<String> predicateLabel = new ArrayList<>();
            predicateLabel.add("predicate");
            predicateLabel.add("1");
            container.add(predicateLabel);
            
            if(ctx.expr(0).column_name() != null && ctx.expr(1).literal_value() != null) {
            	ArrayList<String> predicateContents = new ArrayList<>();
        		String column_name = "predicatecolumn " + ctx.expr(0).column_name().getText();
        		String value = "predicatevalue " + ctx.expr(1).literal_value().getText();
        		predicateContents.add(column_name);
        		predicateContents.add(value);
        		container.add(predicateContents);
            }
            
            if (
            		ctx.predicate_operator().IN_() != null 
            		&& ctx.expr(0).column_name() != null 
    				&& ctx.expr(1).OPEN_PAR() != null
            		&& ctx.expr(1).expr() != null
        		) {
        		for(int i = 0; i < ctx.expr(1).expr().size(); i++) {
        			if(ctx.expr(1).expr(i).literal_value() != null) {
        				ArrayList<String> predicateContents = new ArrayList<>();
        				String column_name = "predicatecolumn " + ctx.expr(0).column_name().getText();
                		String value = "predicatevalue " + ctx.expr(1).expr(i).literal_value().getText();
                		predicateContents.add(column_name);
                		predicateContents.add(value);
                		container.add(predicateContents);
        			}
        		}
            }
        }
        if(ctx.predicate_or() != null){
            ArrayList<String> pair = new ArrayList<>();
            pair.add("logical_operator");
            pair.add(ctx.predicate_or().getText());
            container.add(pair);
        }
        if(ctx.predicate_and() != null){
            ArrayList<String> pair = new ArrayList<>();
            pair.add("logical_operator");
            pair.add(ctx.predicate_and().getText());
            container.add(pair);
        }
        if(ctx.keyword_exists() != null){
            ArrayList<String> pair = new ArrayList<>();
            pair.add("exists");
            pair.add("1");
            container.add(pair);
        }
        if(ctx.expr() != null){
            for(int i = 0; i < ctx.expr().size(); i++){
                container.addAll(visit(ctx.expr(i)));
            }
        }

        return container;
    }

    public ArrayList<ArrayList<String>> visitTable_name(
            SQLiteParser.Table_nameContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("table");
        pair.add(
                ctx.any_name().getText()
        );
        container.add(pair);
        return container;
    }

    public ArrayList<ArrayList<String>> visitColumn_name(
            SQLiteParser.Column_nameContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("column");
        pair.add(
                ctx.any_name().getText()
        );
        container.add(pair);
        return container;
    }

    public ArrayList<ArrayList<String>> visitFunction_name(
            SQLiteParser.Function_nameContext ctx
    ){
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("function");
        pair.add(
                ctx.any_name().getText()
        );
        container.add(pair);
        return container;
    }

}
