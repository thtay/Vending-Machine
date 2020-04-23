package com.rob.rest.contract;

import com.rob.domain.VendingItem;
import com.rob.infrastructure.contract.VendingItemRepo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
public interface VendingItemResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response getAllItem();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveItem(final VendingItem item);

}
