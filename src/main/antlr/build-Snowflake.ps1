.\antlr4 -v 4.13.2 SnowflakeLexer.g4 -o ..\java\snowflake -package snowflake
.\antlr4 -v 4.13.2 SnowflakeParser.g4 -o ..\java\snowflake -lib ..\java\snowflake -package snowflake -visitor -listener