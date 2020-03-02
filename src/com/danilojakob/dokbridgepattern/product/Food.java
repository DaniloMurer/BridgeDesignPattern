package com.danilojakob.dokbridgepattern.product;

public class Food extends AbstractProduct {

    @Override
    public int getAmount() {
        return amount_;
    }

    @Override
    public double getPrice() {
        return price_;
    }

    @Override
    public String getName() {
        return name_;
    }

    @Override
    public String getBrand() {
        return brand_;
    }

    @Override
    public void setAmount(int amount) {
        amount_ = amount;
    }

    @Override
    public void setPrice(double price) {
        price_ = price;
    }

    @Override
    public void setName(String name) {
        name_ = name;
    }

    @Override
    public void setBrand(String brand) {
        brand_ = brand;
    }
}
