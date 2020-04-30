package com.rob.rest.contract;

import com.rob.domain.VendingItem;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
public interface VendingItemResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<VendingItem> getAllItem();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response saveItem(final VendingItem item);

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response getItemByID(final @PathParam("id") String id);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    Response updateItem(final VendingItem item, final @PathParam("id") String id);

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response deleteItem(final @PathParam("id") String id);
}
