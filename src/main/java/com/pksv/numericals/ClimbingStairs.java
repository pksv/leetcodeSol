package com.pksv.numericals;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(45));
    }

    public int climbStairs(int n) {
        Map<Integer, Integer> x = new HashMap<>();
        return climbStairs(n, x);
    }

    public int climbStairs(int n, Map<Integer, Integer> x) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!x.containsKey(n)) {
            x.put(n, climbStairs(n - 1, x) + climbStairs(n - 2, x));
        }

        return x.get(n);
    }
}
