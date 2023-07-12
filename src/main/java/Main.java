import server.ParserServer;

import java.util.Locale;
import queryelementscraper.QueryElementScraper;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting the SQL Parser Analyzer.");

        Boolean doServer = false;
        Boolean doQuery = false;
        String query = "";

        for(int i = 0; i < args.length; i++){
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
        }

        if(doServer) {
            ParserServer server = new ParserServer();
            server.run();
        }

        if(doQuery) {
            System.out.println("Analyzing query: " + query);
            QueryElementScraper scraper = new QueryElementScraper(query);
            scraper.printParseTree();
            System.out.println("Scraping query");
            scraper.scrapeQuery();
        }

    }
}
