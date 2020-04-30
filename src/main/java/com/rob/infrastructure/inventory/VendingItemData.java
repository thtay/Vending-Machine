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
                .id("0001")
                .price((int) 100)
                .description("Coke")
                .build());
        itemRepository.saveItem(VendingItem.builder()
                .title("Pepsi")
                .id("0002")
                .price((int) 100)
                .description("Pepsi")
                .build());
        itemRepository.saveItem(VendingItem.builder()
                .title("Dr.Pepper")
                .id("0004")
                .price((int) 100)
                .description("Dr.Pepper")
                .build());
        itemRepository.saveItem(VendingItem.builder()
                .title("Tea")
                .id("0005")
                .price((int) 100)
                .description("Tea")
                .build());
        itemRepository.saveItem(VendingItem.builder()
                .title("Fanta")
                .id("0006")
                .price((int) 100)
                .description("Fanta")
                .build());
    }
}
