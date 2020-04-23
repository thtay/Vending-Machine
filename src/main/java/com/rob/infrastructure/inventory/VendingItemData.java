package com.rob.infrastructure.inventory;

import com.rob.domain.VendingItemBuilder;
import com.rob.infrastructure.implementation.VendingItemRepoImp;

import java.text.ParseException;

public class VendingItemData {

    private VendingItemRepoImp itemRepository;

    public void populateRepositories() {
        try {

            // Create the vending machine items
            itemRepository.saveItem(new VendingItemBuilder()
                    .setTitle("Coke")
                    .setId("1")
                    .setPrice((float) 1.0)
                    .setDescription("Coke")
                    .createItem());
        } catch (NullPointerException e) {
            System.out.println("Exception thrown: " + e);
        }
    }

}
