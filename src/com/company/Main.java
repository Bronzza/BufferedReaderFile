package com.company;

import com.company.Flowers.Flower;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();

        System.out.println(Arrays.toString(flowerStore.sell(5, 4, 3)));
        System.out.println(Arrays.toString(flowerStore.sellSequence(6, 4, 2)));
        try {
            System.out.println(Arrays.toString(FlowersLoader.loadFromFile("C:\\Users\\Sergey\\" +
                    "IdeaProjects\\HomeWork6\\src\\flowers.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
