package queryelementscraper;

import org.antlr.v4.runtime.tree.ParseTree;
import tsql.TSqlParser;
import tsql.TSqlParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TSqlScraperVisitor extends TSqlParserBaseVisitor {

    public ArrayList<ArrayList<String>> visitSelect_statement(
            TSqlParser.Select_statementContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        container.addAll(
                (ArrayList<ArrayList<String>>) visit(ctx.query_expression())
        );
        return container;
    }

    public ArrayList<ArrayList<String>> visitQuery_expression(
            TSqlParser.Query_expressionContext ctx
    ) {
        ArrayList<ArrayList<String>> queryElementList;
        queryElementList
                = (ArrayList<ArrayList<String>>) visit(ctx.query_specification());
        return queryElementList;
    }

    public ArrayList<ArrayList<String>> visitQuery_specification(
            TSqlParser.Query_specificationContext ctx
    ) {
        ArrayList<ArrayList<String>> container
                = (ArrayList<ArrayList<String>>) visit(ctx.select_list());
        try{
            ArrayList<ArrayList<String>> tableSourceList
                    = (ArrayList<ArrayList<String>>) visit(ctx.table_sources());
            container.addAll(tableSourceList);
        } catch(Exception e) { }
        if(ctx.search_condition() != null) {
            for(int i = 0; i < ctx.search_condition().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(ctx.search_condition(i))
                );
            }
        }
        if(ctx.group_by_item() != null) {
            for(int i = 0; i < ctx.group_by_item().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(
                                ctx.group_by_item(i).expression()
                        )
                );
            }
        }
        if(ctx.grouping_sets_item() != null) {
            for(int i = 0; i < ctx.grouping_sets_item().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(
                                ctx.grouping_sets_item(i)
                        )
                );
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitGrouping_sets_item(
            TSqlParser.Grouping_sets_itemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        for(int i = 0; i < ctx.group_by_item().size(); i++) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.group_by_item(i))
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
                        (ArrayList<ArrayList<String>>) visit(ctx.table_source(i))
                );
            }
        } else if (ctx.non_ansi_join() != null) {
            for(int i = 0; i < ctx.non_ansi_join().table_source().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(
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
                (ArrayList<ArrayList<String>>) visit(ctx.table_source_item())
        );
        try{
            for(int i = 0; i < ctx.join_part().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(ctx.join_part().get(i))
                );
            }
        } catch(Exception e) {}
        return container;
    }

    public ArrayList<ArrayList<String>> visitTable_source_item(
            TSqlParser.Table_source_itemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.full_table_name() != null) {
            ArrayList<String> pair = new ArrayList<>();
            pair.add("table");
            pair.add(
                    ctx.full_table_name().id_(
                            ctx.full_table_name().id_().size() - 1
                    ).getText()
            );
            container.add(pair);
        }
        if(ctx.function_call() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.function_call())
            );
        }
        if(ctx.derived_table() != null && ctx.derived_table().subquery() != null) {
            for(int i = 0; i < ctx.derived_table().subquery().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(
                                ctx.derived_table().subquery(i).select_statement()
                        )
                );
            }
        }
        if(ctx.table_source() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
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
        if(ctx.join_on() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.join_on().table_source())
            );
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
                            ctx.join_on().search_condition()
                    )
            );
        } else if (ctx.cross_join() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.cross_join().table_source_item())
            );
        } else if (ctx.apply_() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.apply_().table_source_item())
            );
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitSearch_condition(
            TSqlParser.Search_conditionContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.predicate() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.predicate())
            );
        } else {
            for(int i = 0; i < ctx.search_condition().size(); i++) {
                container.addAll((ArrayList<ArrayList<String>>) visit(ctx.search_condition(i)));
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitPredicate(
            TSqlParser.PredicateContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        if(ctx.subquery() != null) {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.subquery())
            );
        }
        if(ctx.expression() != null) {
            for(int i = 0; i < ctx.expression().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(ctx.expression(i))
                );
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitSelect_list(
            TSqlParser.Select_listContext ctx
    ) {
        ArrayList<ArrayList<String>> selectElementList
                = new ArrayList<>();
        for(int i = 0; i < ctx.selectElement.size(); i++) {
            selectElementList.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.selectElement.get(i))
            );
        }
        return selectElementList;
    }

    public ArrayList<ArrayList<String>> visitSelect_list_elem(
            TSqlParser.Select_list_elemContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();

        try{
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
                            ctx.expression_elem()
                                    .expression()
                    )
            );
        } catch(Exception e) { }

        return container;
    }

    public ArrayList<ArrayList<String>> visitExpression(
            TSqlParser.ExpressionContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        try{
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
                            ctx.full_column_name()
                    )
            );
        } catch(Exception e) {}
        try{
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
                            ctx.function_call()
                    )
            );
        } catch (Exception e) {}
        if(ctx.expression() != null) {
            for(int i = 0; i < ctx.expression().size(); i++) {
                container.addAll(
                        (ArrayList<ArrayList<String>>) visit(ctx.expression(i))
                );
            }
        }
        return container;
    }

    public ArrayList<ArrayList<String>> visitFull_column_name(
            TSqlParser.Full_column_nameContext ctx
    ) {
        ArrayList<ArrayList<String>> container = new ArrayList<>();
        ArrayList<String> pair = new ArrayList<>();
        if(ctx.id_() != null) {
            pair.add("column");
            pair.add(ctx.id_().getText());
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
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
                            ctx.aggregate_windowed_function()
                                    .all_distinct_expression()
                                    .expression()
                    )
            );
            functionType.add("function");
            functionType.add(ctx.aggregate_windowed_function().getChild(0).getText());
            container.add(functionType);
        } catch(Exception e) {}
        try {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(
                            ctx.analytic_windowed_function().expression(0)
                    )
            );
        } catch(Exception e) {}
        try {
            container.addAll(
                    (ArrayList<ArrayList<String>>) visit(ctx.built_in_functions())
            );
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
                        (ArrayList<ArrayList<String>>) visit(ctx.expression(i))
                );
            }
        }
        return container;
    }

}
