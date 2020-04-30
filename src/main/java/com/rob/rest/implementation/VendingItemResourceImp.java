package com.rob.rest.implementation;

import com.rob.domain.VendingItem;
import com.rob.infrastructure.contract.VendingItemRepo;
import com.rob.infrastructure.inventory.VendingItemData;
import com.rob.rest.contract.VendingItemResource;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

public class VendingItemResourceImp implements VendingItemResource {

    private VendingItemRepo itemRepository = VendingItemData.getItemRepository();

    @Override
    public List<VendingItem> getAllItem() {
        return itemRepository.getAll();
    }

    @Override
    public Response saveItem(VendingItem item) {
        itemRepository.saveItem(item);
        return Response.ok().build();
    }

    @Override
    public Response getItemByID(String id) {
        Optional<VendingItem> item = itemRepository.getByID(id);
        if (item.isPresent()) {
            return Response.ok(item.get()).build();
        }
        return Response.noContent().build();
    }

    @Override
    public Response updateItem(VendingItem item, String id) {
        itemRepository.saveItem(item);
        return Response.ok().build();
    }

    @Override
    public Response deleteItem(String id) {
        itemRepository.deleteItem(id);
        return Response.ok().build();
    }
}
