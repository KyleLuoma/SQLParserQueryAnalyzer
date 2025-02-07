java org.antlr.v4.Tool SQLiteLexer.g4 -o ..\java\sqlite -package sqlite
java org.antlr.v4.Tool SQLiteParser.g4 -o ..\java\sqlite -lib ..\java\sqlite -package sqlite -visitor -listener
