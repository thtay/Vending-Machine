package com.rob.rest.contract;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@SuppressWarnings("checkstyle:Indentation")
@Path("/service")
public interface HelloRestInterface {
    @GET //This annotation indicates GET Requests
    @Path("/hello")
    Response hello();

}

