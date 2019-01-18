package com.zueras.homeshop;

public class Television extends Product {
    private int size;
    private int slabType;

    public Television(String name, String description, double price, int size, int slabType) {
        super(name, description, price);
        this.size = size;
        this.slabType = slabType;
    }

    public int getSize() {
        return size;
    }

    public int getSlabType() {
        return slabType;
    }
}
