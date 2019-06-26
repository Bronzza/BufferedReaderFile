package com.company;

import com.company.Flowers.Chamomile;
import com.company.Flowers.Flower;
import com.company.Flowers.Rose;
import com.company.Flowers.Tulip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlowerStore {
    private int wallet = 0;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int rose, int chamomile, int tulip) {
        final List<Flower> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < rose; i++) {
            list.add(new Rose());
            wallet += list.get(counter++).getPrice();

        }
        for (int i = 0; i < chamomile; i++) {
            list.add(new Chamomile());
            wallet += list.get(counter++).getPrice();
        }
        for (int i = 0; i < tulip; i++) {
            list.add(new Tulip());
            wallet += list.get(counter++).getPrice();
        }
        return list.toArray(new Flower[0]);
    }

    public Flower[] sellSequence(int rose, int chamomile, int tulip) {
        Flower[] flowers = new Flower[rose + chamomile + tulip];
        int counter = 0;
        int maxNumber = Stream.of(rose, chamomile, tulip).max((p1, p2) -> (p1.compareTo(p2))).get();
        for (int i = 0; i < maxNumber; i++) {
            if (i < rose) {
                flowers[counter] = new Rose();
                wallet += flowers[counter++].getPrice();
            }
            if (i < chamomile) {
                flowers[counter] = new Chamomile();
                wallet += flowers[counter++].getPrice();
            }
            if (i < tulip) {
                flowers[counter] = new Tulip();
                wallet += flowers[counter++].getPrice();
            }
        }
        return flowers;
    }
}