package com.gft.jersey;


import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class GrizzlyApplication {

	public static final String BASE_URI = "http://localhost:8080/";

	public static HttpServer startServer() {
		final ResourceConfig rc = new ResourceConfig().packages("com.gft.jersey.resource");
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
	}

	public static void main(String[] args) throws IOException {
		final HttpServer server = startServer();
		System.out.println("Server started on port 8080");
		System.in.read();
		server.shutdownNow();
	}

}
