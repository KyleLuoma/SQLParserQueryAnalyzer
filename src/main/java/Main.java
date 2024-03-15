import queryschemaidentifiertagger.QuerySchemaIdentifierTagger;
import queryschemaidentifiertagger.SQLiteQuerySchemaIdentifierTagger;
import queryschemaidentifiertagger.TSqlQuerySchemaIdentifierTagger;
import server.ParserServer;

import java.util.Locale;
import queryelementscraper.QueryElementScraper;

public class Main {

    public enum SqlDialect {TSQL, SQLITE}

    public static void main(String[] args) throws Exception {
        System.out.println("Starting the SQL Parser Analyzer.");

        Boolean doServer = false;
        Boolean doQuery = false;
        Boolean schematagging = false;
        String query = "";
        SqlDialect sqlDialect = SqlDialect.TSQL;

        for(int i = 0; i < args.length; i++){
            if(args[i].toLowerCase(Locale.ROOT).equals("--help")) {
                System.out.println("SQL Parser Query Analyzer Options:");
                System.out.println(" --server : launches a small server to handle API requests for parsing (TSQL only");
                System.out.println(" Command line options (select one or the other):");
                System.out.println(" --query \"SELECT A FROM...\" : the query you wish to analyze encased in quotes");
                System.out.println(" --schematagger \"SELECT A FROM...\" : the query you wish to tag");
                System.out.println(" Tagger options:");
                System.out.println(" --dialect [tsql | sqlite] : the dialect of the query you are tagging.");
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--server")) {
                doServer = true;
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--query")) {
                try {
                    query = args[i + 1];
                    doQuery = true;
                } catch(Exception e) {
                    System.out.println("query argument must be followed by a query encased in quotes");
                }
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--schematagger")){
                try {
                    query = args[i + 1];
                    schematagging = true;
                } catch(Exception e) {
                    System.out.println("query to tag renaming elements must be followed by a query encased in quotes");
                }
            }
            if(args[i].toLowerCase(Locale.ROOT).equals("--dialect")){
                try {
                    String dialectArg = args[i + 1];
                    if(dialectArg.toLowerCase(Locale.ROOT).equals("tsql")){
                        sqlDialect = SqlDialect.TSQL;
                    } else if(dialectArg.toLowerCase(Locale.ROOT).equals("sqlite")){
                        sqlDialect = SqlDialect.SQLITE;
                    }
                } catch(Exception e) {
                    System.out.println("Dialect option selected without dialect selection argument");
                }
            }
        }

        if(doServer) {
            ParserServer server = new ParserServer();
            server.run();
        }

        if(doQuery) {
            QueryElementScraper scraper = new QueryElementScraper(query);
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
