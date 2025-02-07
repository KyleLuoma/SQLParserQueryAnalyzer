java org.antlr.v4.Tool TSqlLexer.g4 -o ..\java\tsql -package tsql
java org.antlr.v4.Tool TSqlParser.g4 -o ..\java\tsql -lib ..\java\tsql -package tsql -visitor -listener
