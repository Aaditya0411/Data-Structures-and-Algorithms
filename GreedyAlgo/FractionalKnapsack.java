package GreedyAlgo;

import java.util.Arrays;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int capacity = 50;
        int totalValue = 0;

        // storing ratio
        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        // item check
        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];

            if (weight[idx] <= capacity) {
                totalValue = totalValue + value[idx];
                capacity = capacity - weight[idx];
            } else {
                totalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println(totalValue);

    }

}