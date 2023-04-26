package com.gft.jersey.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/animes")
public class AnimeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAnime() {
        return "{\"name\": \"Anime\"}";
    }
}

