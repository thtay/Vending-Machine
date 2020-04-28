package com.rob.rest.implementation;

import com.rob.domain.VendingItem;
import com.rob.infrastructure.contract.VendingItemRepo;
import com.rob.infrastructure.inventory.VendingItemData;
import com.rob.rest.contract.VendingItemResource;
import javax.ws.rs.core.Response;
import java.util.List;

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
}
