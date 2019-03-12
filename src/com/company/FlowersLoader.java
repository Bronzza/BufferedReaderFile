package com.company;

import com.company.Flowers.Flower;

import java.io.*;

public class FlowersLoader {

    private static FlowersLoader flowersLoader = null;

    private FlowersLoader() {
    }

    public static FlowersLoader getInstance() {
        if (flowersLoader != null) {
            return flowersLoader;
        } else {
            return flowersLoader = new FlowersLoader();
        }
    }

    public static Flower[] loadFromFile(String filePath) throws IOException {
        FlowerStore store = new FlowerStore();
        int[] quantity = new int[3];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String c;
            int counter = 0;
            while ((c = br.readLine()) != null) {
                quantity[counter++] = Integer.parseInt(c);
                if (counter == 3) {
                    break;
                }
            }
        }
        return store.sell(quantity[0], quantity[1], quantity[2]);
    }
}
