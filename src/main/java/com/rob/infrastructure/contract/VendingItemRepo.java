package com.rob.infrastructure.contract;

import com.rob.domain.VendingItem;

import java.util.List;
import java.util.Optional;

public interface VendingItemRepo {
    VendingItem saveItem(final VendingItem item);

    Optional<VendingItem> deleteItem(final String id);

    List<VendingItem> getAll();

    Optional<VendingItem> getByID(String id);

}
