package queryelementscraper;

import tsql.TSqlParser;
import tsql.TSqlParserBaseVisitor;

import java.sql.Array;
import java.util.ArrayList;

public class TSqlScraperVisitor extends TSqlParserBaseVisitor<ArrayList<ArrayList<String>>> {

    public ArrayList<ArrayList<String>> visitSelect_statement(
            TSqlParser.Select_statementContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        container.addAll(
                visit(ctx.query_expression())
        );
        return container;
    }

    public ArrayList<ArrayList<String>> visitQuery_expression(
            TSqlParser.Query_expressionContext ctx
    ) {
        ArrayList<ArrayList<String>> container;
        container = visit(ctx.query_specification());
        if(ctx.select_order_by_clause() != null) {
            container.addAll(visit(ctx.select_order_by_clause()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitSelect_order_by_clause(
            TSqlParser.Select_order_by_clauseContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> obLabel = new ArrayList<>();
        obLabel.add("order by");
        obLabel.add("1");
        container.add(obLabel);
        for(int i = 0; i < ctx.order_by_clause().order_by_expression().size(); i++){
            container.addAll(
                    visit(ctx.order_by_clause().order_by_expression(i).expression())
            );
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitQuery_specification(
            TSqlParser.Query_specificationContext ctx
    ) {
        ArrayList<ArrayList<String>> container = visit(ctx.select_list());
        if(ctx.top_clause() != null) {
            ArrayList<String> topLabel = new ArrayList<>();
            topLabel.add("top clause");
            topLabel.add("1");
            container.add(topLabel);
        }
        if(ctx.table_sources() != null) {
            ArrayList<ArrayList<String>> tableSourceList = visit(ctx.table_sources());
            container.addAll(tableSourceList);
        }
        if(ctx.search_condition() != null) {
            ArrayList<String> whereLabel = new ArrayList<>();
            whereLabel.add("where");
            whereLabel.add("1");
            container.add(whereLabel);
            container.addAll(visit(ctx.search_condition()));
        }
        if(ctx.group_by_item() != null) {
            for(int i = 0; i < ctx.group_by_item().size(); i++) {
                container.addAll(visit(ctx.group_by_item(i)));
            }
        }
        if(ctx.grouping_sets_item() != null) {
            for(int i = 0; i < ctx.grouping_sets_item().size(); i++) {
                container.addAll(
                        visit(
                                ctx.grouping_sets_item(i)
                        )
                );
            }
        }
        if(ctx.having_clause() != null) {
            ArrayList<String> havingLabel = new ArrayList<>();
            havingLabel.add("having");
            havingLabel.add("1");
            container.add(havingLabel);
            container.addAll(visit(ctx.having_clause().search_condition()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitGroup_by_item(
            TSqlParser.Group_by_itemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("group by");
        pair.add("1");
        container.add(pair);
        container.addAll(
                visit(ctx.expression())
        );
        return container;
    }

    public ArrayList<ArrayList<String>> visitGrouping_sets_item(
            TSqlParser.Grouping_sets_itemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        for(int i = 0; i < ctx.group_by_item().size(); i++) {
            container.addAll(
                    visit(ctx.group_by_item(i))
            );
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitTable_sources(
            TSqlParser.Table_sourcesContext ctx
    )   {
        ArrayList<ArrayList<String>> container = new ArrayList<>();

        if(ctx.table_source() != null) {
            for(int i = 0; i < ctx.table_source().size(); i++){
                container.addAll(
                        visit(ctx.table_source(i))
                );
            }
        }
        if (ctx.non_ansi_join() != null) {
            ArrayList<String> nonAnsiLabel = new ArrayList<>();
            nonAnsiLabel.add("non ansi join");
            nonAnsiLabel.add("1");
            container.add(nonAnsiLabel);
            for(int i = 0; i < ctx.non_ansi_join().table_source().size(); i++) {
                container.addAll(
                        visit(
                                ctx.non_ansi_join().table_source(i)
                        )
                );
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitTable_source(
            TSqlParser.Table_sourceContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        container.addAll(
                visit(ctx.table_source_item())
        );
        if(ctx.join_part() != null) {
            for(int i = 0; i < ctx.join_part().size(); i++) {
                container.addAll(
                        visit(ctx.join_part().get(i))
                );
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitTable_source_item(
            TSqlParser.Table_source_itemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> label_pair = new ArrayList<>();
        label_pair.add("table source item");
        label_pair.add("1");
        container.add(label_pair);
        if(ctx.full_table_name() != null) {
            ArrayList<String> pair = new ArrayList<>();
            pair.add("table");
            pair.add(
                    ctx.full_table_name().atomic_table_name().getText()
            );
            container.add(pair);
        }
        if(ctx.function_call() != null) {
            container.addAll(
                    visit(ctx.function_call())
            );
        }
        if(ctx.derived_table() != null && ctx.derived_table().subquery() != null) {
            for(int i = 0; i < ctx.derived_table().subquery().size(); i++) {
                container.addAll(
                        visit(
                                ctx.derived_table().subquery(i)
                        )
                );
            }
        }
        if(ctx.table_source() != null) {
            container.addAll(
                    visit(
                            ctx.table_source()
                    )
            );
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitJoin_part(
            TSqlParser.Join_partContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("join");
        pair.add("1");
        container.add(pair);
        if(ctx.join_on() != null) {
            container.addAll(
                    visit(ctx.join_on().table_source())
            );
            container.addAll(
                    visit(
                            ctx.join_on().search_condition()
                    )
            );
            // Check for composite key join
            if(
                    ctx.join_on().search_condition().search_condition() != null
                    && ctx.join_on().search_condition().search_condition().size() > 1
            ) {
                ArrayList<String> ckPair = new ArrayList<>();
                ckPair.add("composite-key-join");
                ckPair.add("1");
                container.add(ckPair);
            }
        } else if (ctx.cross_join() != null) {
            container.addAll(
                    visit(ctx.cross_join().table_source_item())
            );
        } else if (ctx.apply_() != null) {
            container.addAll(
                    visit(ctx.apply_().table_source_item())
            );
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitSearch_condition(
            TSqlParser.Search_conditionContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.predicate() != null) {
            if(ctx.getChild(0).getText().equals("NOT")){
                ArrayList<String> notLabel = new ArrayList<>();
                notLabel.add("negation");
                notLabel.add("1");
                container.add(notLabel);
            }
            container.addAll(
                    visit(ctx.predicate())
            );
        } else {
            ArrayList<String> logicalLabel = new ArrayList<>();
            logicalLabel.add("logical operator");
            logicalLabel.add(ctx.getChild(1).getText());
            container.add(logicalLabel);
            for(int i = 0; i < ctx.search_condition().size(); i++) {
                container.addAll(visit(ctx.search_condition(i)));
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitPredicate(
            TSqlParser.PredicateContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> predicateLabel = new ArrayList<>();
        predicateLabel.add("predicate");
        predicateLabel.add("1");
        container.add(predicateLabel);

        if(ctx.children.size() > 0 && ctx.getChild(0).getText().equals("EXISTS")){
            ArrayList<String> existsLabel = new ArrayList<>();
            existsLabel.add("exists");
            existsLabel.add("1");
            container.add(existsLabel);
        }

        if(ctx.subquery() != null) {
            container.addAll(
                    visit(ctx.subquery())
            );
        }

        if(
                ctx.getChild(1).getText().equals("NOT")
                || ctx.null_notnull() != null
        ) {
            ArrayList<String> negationLabel = new ArrayList<>();
            negationLabel.add("negation");
            negationLabel.add("1");
            container.add(negationLabel);
        }

        if(ctx.expression() != null) {
            for(int i = 0; i < ctx.expression().size(); i++) {
                container.addAll(
                        visit(ctx.expression(i))
                );
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitSubquery(
            TSqlParser.SubqueryContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> sqPair = new ArrayList<>();
        sqPair.add("subquery");
        sqPair.add("1");
        container.add(sqPair);
        container.addAll(
                visit(ctx.select_statement())
        );
        return container;
    }

    public ArrayList<ArrayList<String>> visitSelect_list(
            TSqlParser.Select_listContext ctx
    ) {
        ArrayList<ArrayList<String>> selectElementList
                = new ArrayList<>();
        for(int i = 0; i < ctx.selectElement.size(); i++) {
            selectElementList.addAll(
                    visit(ctx.selectElement.get(i))
            );
        }
        return selectElementList;
    }

    public ArrayList<ArrayList<String>> visitSelect_list_elem(
            TSqlParser.Select_list_elemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        pair.add("select element");
        pair.add("1");
        container.add(pair);
        if(ctx.expression_elem() != null) {
            container.addAll(
                    visit(ctx.expression_elem().expression()
                    )
            );
        }
        if(ctx.asterisk() != null) {
            ArrayList<String> astLabel = new ArrayList<>();
            astLabel.add("asterisk");
            astLabel.add("1");
            container.add(astLabel);
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitExpression(
            TSqlParser.ExpressionContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.full_column_name() != null) {
            container.addAll(visit(ctx.full_column_name()));
        }
        if(ctx.function_call() != null) {
            container.addAll(visit(ctx.function_call()));
        }

        if(ctx.expression() != null) {
            for(int i = 0; i < ctx.expression().size(); i++) {
                container.addAll(visit(ctx.expression(i)));
            }
        }
        if(ctx.case_expression() != null) {
            container.addAll(visit(ctx.case_expression()));
        }
        if(ctx.bracket_expression() != null) {
            container.addAll(visit(ctx.bracket_expression()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitCase_expression(
            TSqlParser.Case_expressionContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();

        ArrayList<String> caseLabel = new ArrayList<>();
        caseLabel.add("case");
        caseLabel.add("1");
        container.add(caseLabel);

        if(ctx.switch_search_condition_section() == null){
            for(int i = 0; i < ctx.expression().size(); i++){
                container.addAll(visit(ctx.expression(i)));
            }
        } else {
            for(int i = 0; i < ctx.switch_search_condition_section().size(); i++){
                container.addAll(
                        visit(ctx.switch_search_condition_section(i).search_condition())
                );
                container.addAll(
                        visit(ctx.switch_search_condition_section(i).expression())
                );
            }

        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitBracket_expression(
            TSqlParser.Bracket_expressionContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.expression() != null) {
            container.addAll(visit(ctx.expression()));
        }
        if(ctx.subquery() != null) {
            container.addAll(visit(ctx.subquery()));
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitFull_column_name(
            TSqlParser.Full_column_nameContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        if(ctx.column_name() != null) {
            pair.add("column");
            pair.add(ctx.column_name().getText());
            container.add(pair);
        } else if (ctx.getText().charAt(0) == '$') {
            pair.add("column");
            pair.add(ctx.getText());
            container.add(pair);
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitFunction_call(
            TSqlParser.Function_callContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> functionType = new ArrayList<>();
        try {
            functionType.add("function");
            functionType.add(ctx.aggregate_windowed_function().getChild(0).getText());
            container.add(functionType);
            container.addAll(
                    visit(
                            ctx.aggregate_windowed_function()
                                    .all_distinct_expression()
                                    .expression()
                    )
            );
        } catch(Exception e) { }
        try {
            container.addAll(
                    visit(
                            ctx.analytic_windowed_function().expression(0)
                    )
            );
            functionType.add("function");
            functionType.add(ctx.analytic_windowed_function().getChild(0).getText());
            container.add(functionType);
        } catch(Exception e) {}
        try {
            container.addAll(
                    visit(ctx.built_in_functions())
            );
            functionType.add("function");
            functionType.add(ctx.built_in_functions().getChild(0).getText());
            container.add(functionType);
        } catch (Exception e) {}

        return container;
    }

    public ArrayList<ArrayList<String>> visitBuilt_in_functions(
            TSqlParser.Built_in_functionsContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.expression() != null) {
            for(int i = 0; i < ctx.expression().size(); i++) {
                container.addAll(
                        visit(ctx.expression(i))
                );
            }
        }
        return container;
    }

}
