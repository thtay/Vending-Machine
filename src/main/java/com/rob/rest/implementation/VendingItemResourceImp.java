package com.rob.rest.implementation;

import com.rob.domain.VendingItem;
import com.rob.infrastructure.contract.VendingItemRepo;
import com.rob.rest.contract.VendingItemResource;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;

public class VendingItemResourceImp implements VendingItemResource {

    private VendingItemRepo itemRepository;

    @Override
    public Response getAllItem() {
        List<VendingItem> items = itemRepository.getAll();
        GenericEntity<List<VendingItem>> itemWrapper = new GenericEntity<List<VendingItem>>(items){};
        return Response.ok(itemWrapper).build();
    }

    @Override
    public Response saveItem(VendingItem item) {
        VendingItem persistedItem = itemRepository.saveItem(item);
        return Response.ok(persistedItem).build();
    }
}
