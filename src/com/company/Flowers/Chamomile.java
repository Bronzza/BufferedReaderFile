package com.company.Flowers;

public class Chamomile extends Flower {

    public Chamomile() {
        price = 70;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chamomile";
    }
}
