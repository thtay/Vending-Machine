package com.rob.rest.implementation;

import com.rob.rest.contract.HelloRestInterface;
import javax.ws.rs.core.Response;

public class HelloRestService implements HelloRestInterface {
    public Response hello() {
        return Response.status(200).entity("hello and contracts!").build();
    }

}

