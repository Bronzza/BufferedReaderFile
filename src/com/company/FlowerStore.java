package com.company;

import com.company.Flowers.Chamomile;
import com.company.Flowers.Flower;
import com.company.Flowers.Rose;
import com.company.Flowers.Tulip;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

    private int wallet = 0;

    public FlowerStore() {
    }

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int rose, int chamomile, int tulip) {
        Flower[] flow = new Flower[0];
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
        return list.toArray(flow);
    }

    public Flower[] sellSequence(int rose, int chamomile, int tulip) {
        Flower[] flowers = new Flower[rose + chamomile + tulip];
        int counter = 0;
        for (int i = 0; i < findMax(rose, chamomile, tulip); i++) {
            if (i < rose) {
                flowers[counter] = new Rose();
                wallet = flowers[counter++].getPrice();
            }
            if (i < chamomile) {
                flowers[counter] = new Chamomile();
                wallet = flowers[counter++].getPrice();
            }
            if (i < tulip) {
                flowers[counter] = new Tulip();
                wallet = flowers[counter++].getPrice();
            }
        }
        return flowers;
    }

    private int findMax(int numb1, int numb2, int numb3) {
        if (numb1 < numb2) {
            numb1 = numb2;
        }
        if (numb1 < numb3) {
            numb1 = numb3;
        }
        return numb1;
    }
}










