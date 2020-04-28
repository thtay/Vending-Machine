package com.rob.rest.contract;

import com.rob.domain.VendingItem;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/items")
public interface VendingItemResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<VendingItem> getAllItem();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveItem(final VendingItem item);

}
