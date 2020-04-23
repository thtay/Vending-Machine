package com.rob.domain;

public class VendingItemBuilder {
    private String id;
    private String title;
    private String description;
    private Float price;

    public VendingItemBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public VendingItemBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public VendingItemBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public VendingItemBuilder setPrice(Float price) {
        this.price = price;
        return this;
    }

    public VendingItem createItem() {
        return new VendingItem(id, title, description, price);
    }
}
