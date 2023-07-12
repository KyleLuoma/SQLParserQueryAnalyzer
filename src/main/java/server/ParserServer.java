package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import org.json.JSONObject;
import queryelementscraper.QueryElementScraper;

public class ParserServer {

    public void run() throws Exception {
        int port = 5150;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/analyze/tsql", new AnalyzeTSqlRequestHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("SQL Parser Analyzer running on port " + port);
    }

    static class AnalyzeTSqlRequestHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            InputStream is = t.getRequestBody();
            StringBuilder requestBodySB = new StringBuilder();
            int i;
            while ((i = is.read()) != -1) {
                char c = (char) i;
                if (c == '\n' || c == '\r') {
                    requestBodySB.append(' ');
                } else {
                    requestBodySB.append(c);
                }
            }
            System.out.println("Received request: " + requestBodySB.toString());
            // JSON parsing of request object here.
            JSONObject jsonObject = new JSONObject(requestBodySB.toString());

            // Retrieve string with label "query" in the JSON file:
            String query = jsonObject.getString("query");
            System.out.println("Query: " + query);

            QueryElementScraper scraper = new QueryElementScraper(query.toUpperCase(Locale.ROOT));
            String response = scraper.getQueryElementsAsJsonString();

            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes(StandardCharsets.UTF_8));
            os.close();

        }
    }

}
