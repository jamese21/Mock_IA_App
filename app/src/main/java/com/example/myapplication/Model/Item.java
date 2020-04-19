package com.example.myapplication.Model;

public class Item {
    String name, image;
    int quantity;
    boolean hasStock;
    double price;

    public Item(String name, String image, int quantity, boolean hasStock, double price) {
        this.name = name;
        this.image = image;
        this.quantity = quantity;
        this.hasStock = hasStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isHasStock() {
        return hasStock;
    }

    public void setHasStock(boolean hasStock) {
        this.hasStock = hasStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
