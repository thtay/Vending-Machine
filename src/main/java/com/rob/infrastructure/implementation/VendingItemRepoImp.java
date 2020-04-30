package com.rob.infrastructure.implementation;

import com.rob.domain.VendingItem;
import com.rob.infrastructure.contract.VendingItemRepo;
import java.util.*;

public class VendingItemRepoImp implements VendingItemRepo {

    private final Map<String, VendingItem> items = new HashMap<>();

    @Override
    public VendingItem saveItem(VendingItem item) {
        items.put(item.getId(), item);
        return item;
    }

    @Override
    public Optional<VendingItem> deleteItem(String id) {
        return Optional.of(items.remove(id));
    }

    @Override
    public List<VendingItem> getAll() {
        return new ArrayList<>(items.values());
    }

    @Override
    public Optional<VendingItem> getByID(String id) {
        return Optional.ofNullable(items.get(id));
    }

}
