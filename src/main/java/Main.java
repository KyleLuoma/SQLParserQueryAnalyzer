import queryelementscraper.SQliteQueryElementScraper;
import queryelementscraper.SnowflakeQueryElementScraper;
import queryelementscraper.TSqlQueryElementScraper;
import queryschemaidentifiertagger.QuerySchemaIdentifierTagger;
import queryschemaidentifiertagger.SQLiteQuerySchemaIdentifierTagger;
import queryschemaidentifiertagger.TSqlQuerySchemaIdentifierTagger;
import server.ParserServer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

import queryelementscraper.PostgreSQLQueryElementScraper;
import queryelementscraper.QueryElementScraper;

public class Main {

    public enum SqlDialect {TSQL, SQLITE, POSTGRESQL, SNOWFLAKE}

    public static void main(String[] args) throws Exception {
        System.out.println("Starting the SQL Parser Analyzer.");

        Boolean doServer = false;
        Boolean doQuery = false;
        Boolean schematagging = false;
        String query = "";
        SqlDialect sqlDialect = SqlDialect.TSQL;
        String version = "1.34";
        String version_date = "5 August 2025";

        for(int i = 0; i < args.length; i++){
            if(args[i].toLowerCase(Locale.ROOT).equals("--help")) {
                System.out.println("SQL Parser Query Analyzer Options:");
                System.out.println(" --server : launches a small server to handle API requests for parsing (TSQL only");
                System.out.println(" Command line options (select one or the other):");
                System.out.println(" --query [\"SELECT A FROM...\" | filename.sql] : the query you wish to analyze encased in quotes");
                System.out.println(" --schematagger [\"SELECT A FROM...\" | filename.sql] : the query you wish to tag");
                System.out.println(" Tagger options:");
                System.out.println(" --dialect [tsql | sqlite | postgressql | bigquery | snowflake] : the dialect of the query you are tagging.");
                System.out.println(" --version : prints the current version.");
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--server")) {
                doServer = true;
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--query")) {
                try {
                    if (args[i + 1].toLowerCase(Locale.ROOT).endsWith(".sql")) {
                        query = new String(Files.readAllBytes(Paths.get(args[i + 1])));
                        // query = query.toUpperCase(Locale.ROOT);
                        // query = query.replace("\r", "").replace("\n", " ");
                    } else {
                        query = args[i + 1];
                    }
                    doQuery = true;
                } catch(Exception e) {
                    System.out.println("query argument must be followed by a query encased in quotes");
                }
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--schematagger")){
                try {
                    if (args[i + 1].toLowerCase(Locale.ROOT).endsWith(".sql")) {
                        query = new String(Files.readAllBytes(Paths.get(args[i + 1])));
                        query = query.replace("\r", "").replace("\n", " ");
                    } else {
                        query = args[i + 1];
                    }
                    schematagging = true;
                } catch(Exception e) {
                    System.out.println("query to tag renaming elements must be followed by a query encased in quotes");
                }
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--dialect")){
                try {
                    String dialectArg = args[i + 1];
                    dialectArg = dialectArg.toLowerCase(Locale.ROOT);
                    if(dialectArg.equals("tsql") || dialectArg.equals("mssql")){
                        sqlDialect = SqlDialect.TSQL;
                    } else if(dialectArg.equals("sqlite")){
                        sqlDialect = SqlDialect.SQLITE;
                    } else if(
                        dialectArg.equals("postgresql")
                        || dialectArg.equals("bigquery")
                        ){
                        sqlDialect = SqlDialect.POSTGRESQL;
                    } else if(dialectArg.equals("snowflake")){
                        sqlDialect = SqlDialect.SNOWFLAKE;
                    }
                } catch(Exception e) {
                    System.out.println("Dialect option selected without dialect selection argument");
                }
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--version")) {
            	System.out.println("SqlParserQueryAnalyzer version " + version + " Compiled on " + version_date);
            }
        }

        if(doServer) {
            ParserServer server = new ParserServer();
            server.run();
        }

        if(doQuery) {
            QueryElementScraper scraper;
            if(sqlDialect == SqlDialect.TSQL){
                scraper = new TSqlQueryElementScraper(query);
                System.out.println("Using TSQL parser.");
            } else if(sqlDialect == SqlDialect.SQLITE){
                scraper = new SQliteQueryElementScraper(query);
                System.out.println("Using SQLITE parser.");
            } else if (sqlDialect == SqlDialect.POSTGRESQL) {
                scraper = new PostgreSQLQueryElementScraper(query);
                System.out.println("Using PostgreSQL parser.");
            } else if (sqlDialect == SqlDialect.SNOWFLAKE) {
                scraper = new SnowflakeQueryElementScraper(query);
                System.out.println("Using Snowflake parser.");
            } else {
                scraper = new TSqlQueryElementScraper(query);
                System.out.println("Using TSQL parser as parser.");
            }

            System.out.println("@BEGINPARSETREE");
            scraper.printParseTree();
            System.out.println("@ENDPARSETREE\n@BEGINJSON");
            String result = scraper.getQueryElementsAsJsonString();
            System.out.println(result);
            System.out.println("@ENDJSON");
        }

        if(schematagging){
            QuerySchemaIdentifierTagger renamer = new TSqlQuerySchemaIdentifierTagger(query);
            if(sqlDialect == SqlDialect.TSQL){
                System.out.println("Using TSQL tagger.");
            } else if(sqlDialect == SqlDialect.SQLITE){
                System.out.println("Using SQLITE tagger.");
                renamer = new SQLiteQuerySchemaIdentifierTagger(query);
            }

            System.out.println("@BEGINTAGGEDQUERY");
            renamer.printQueryString();
            System.out.println("@ENDTAGGEDQUERY");
            System.out.println("@BEGINALIASES");
            renamer.printAliasString();
            System.out.println("@ENDALIASES");
        }

    }
}
