package org.example.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class PingController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage() {
        return "Hello world!";
    }
}
