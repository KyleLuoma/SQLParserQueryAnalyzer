.\antlr4 .\SQLiteLexer.g4 -o ..\java\sqlite -package sqlite
.\antlr4 .\SQLiteParser.g4 -o ..\java\sqlite -lib ..\java\sqlite -package sqlite -visitor -listener
