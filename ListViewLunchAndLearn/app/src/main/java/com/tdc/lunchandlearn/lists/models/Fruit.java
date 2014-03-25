package com.tdc.lunchandlearn.lists.models;

public class Fruit {

    private String name;

    private int imageResource;

    public Fruit(String name, int drawable) {
        this.name = name;
        this.imageResource = drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
