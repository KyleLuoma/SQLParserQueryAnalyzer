.\antlr4 TSqlLexer.g4 -o ..\java\tsql -package tsql
.\antlr4 TSqlParser.g4 -o ..\java\tsql -lib ..\java\tsql -package tsql -visitor -listener
