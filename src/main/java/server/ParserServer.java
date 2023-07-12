package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

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

        }
    }

}
