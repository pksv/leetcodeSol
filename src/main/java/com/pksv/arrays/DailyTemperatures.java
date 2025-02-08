package com.pksv;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
//        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] temperatures = {30, 40, 50, 60};
//        int[] temperatures = {30, 60, 90};
        int[] temperatures = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(temperatures)));
    }

    public int[] dailyTemperaturesBrute(int[] temperatures) {
        int n = temperatures.length;
        int[] wait = new int[n];
        for (int i = 0; i < n; i++) {
            int w = 1;
            int j;
            for (j = i + 1; j < n && temperatures[i] >= temperatures[j]; j++) {
                w++;
            }
            if (j >= n) {
                continue;
            }
            wait[i] = w;
        }
        wait[n - 1] = 0;
        return wait;
    }

    public int[] dailyTemperaturesUsingStack(int[] temperatures) {
        int n = temperatures.length;
        int[] wait = new int[n];
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!temp.empty() && temperatures[temp.peek()] < temperatures[i]) {
                int x = temp.pop();
                wait[x] = i - x;
            }
            temp.push(i);
        }
        return wait;
    }

    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] wait = new int[n];
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (temp[i] >= max) {
                max = temp[i];
                continue;
            }
            int days = 1;
            while (temp[i + days] <= temp[i]) {
                days += wait[i + days];
            }
            wait[i] = days;
        }
        return wait;
    }
}
