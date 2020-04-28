package com.rob.infrastructure.inventory;

import com.rob.domain.VendingItem;
import com.rob.infrastructure.contract.VendingItemRepo;
import com.rob.infrastructure.implementation.VendingItemRepoImp;
import lombok.Getter;

public class VendingItemData {

    @Getter
    private static VendingItemRepo itemRepository = new VendingItemRepoImp();

    static {
        // Create the vending machine items
        itemRepository.saveItem(VendingItem.builder()
                .title("Coke")
                .id("1")
                .price((float) 1.0)
                .description("Coke")
                .build());
    }
}
