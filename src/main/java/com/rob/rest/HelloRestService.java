package com.rob.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/service")
public class HelloRestService {
    @GET //This annotation indicates GET Requests
    @Path("/hello")
    public Response hello() {
        return Response.status(200).entity("hello and something").build();
    }
}
