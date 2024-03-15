# SQLParserQueryAnalyzer
The SQL Parser Query Analyzer is a Java-based command line tool for parsing and tagging SQL Queries.

This project currently supports TSQL and SQLIte dialects only.

## Query Analyzer
The query analyzer currently only supports the TSQL dialect. 
This means that queries with the LIMIT clause will fail, as TSQL uses the TOP clause to limit the tuple count in a result.
The analyzer will parse an SQL query and returns a command line response of clause and identifier types and values.
I use this project in my NL-to-SQL query analysis.

### Analyzer usage example:
At the command line:
```
java -jar ./SQLParserQueryAnalyzer.jar --query "SELECT A, B, C FROM T1"
```
Response:
```
@BEGINPARSETREE
(select_statement_standalone (select_statement (query_expression (query_specification SELECT (select_list (select_list_elem (expression_elem (expression (full_column_name (column_name (id_ A)))))) , (select_list_elem (expression_elem (expression (full_column_name (column_name (id_ B)))))) , (select_list_elem (expression_elem (expression (full_column_name (column_name (id_ C))))))) FROM (table_sources (table_source (table_source_item (full_table_name (atomic_table_name (id_ T1))))))))))
@ENDPARSETREE
@BEGINJSON
[
    {"select element" : "1"},
    {"column" : "A"},
    {"select element" : "1"},
    {"column" : "B"},
    {"select element" : "1"},
    {"column" : "C"},
    {"table source item" : "1"},
    {"table" : "T1"}
]
@ENDJSON
```


## Query Table and Column Tagger
The tagger currently supports TSQL and SQLIte dialects. Queries in other dialects that use the LIMIT clause will probably have a decent chance of parsing correctly by selecting the SQLite dialect.
This feature returns the provided SQL query with table and column names encased in opening and closing XML-style tags. 
It also provides a list of table and column aliases used in the query so that users can isolate aliases tagged as tables and columns in their analysis.
