package com.company.Flowers;

public class Rose extends Flower {

    public Rose() {
        price = 100;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Rose";
    }
}
