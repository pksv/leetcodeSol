package com.pksv;

import java.util.Arrays;

public class AverageWaitingTime {
    public static void main(String[] args) {
//        int[][] customers = {{1, 2}, {2, 5}, {4, 3}};
        int[][] customers = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        System.out.println(new AverageWaitingTime().averageWaitingTime(customers));
    }

    public double averageWaitingTime(int[][] customers) {
        for(var i : customers){
            Arrays.sort(i);
        }
        int time = 0;
        double waitTime = 0;
        for (var customer : customers) {
            if (time < customer[0]) {
                time = customer[0] + customer[1];
                waitTime += customer[1];
            } else {
                time += customer[1];
                waitTime += (time - customer[0]);
            }
        }

        return waitTime / customers.length;
    }
}
