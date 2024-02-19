package com.pksv.numericals;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FizzBuzz().fizzBuzz(15).toArray()));
    }

    public List<String> fizzBuzz1(int n) {
        List<String> sol = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String fizzBuzz = "";
            if (i % 3 == 0) fizzBuzz += "Fizz";
            if (i % 5 == 0) fizzBuzz += "Buzz";
            if (fizzBuzz.isEmpty()) fizzBuzz = i + "";
            sol.add(fizzBuzz);
        }
        return sol;
    }

    public List<String> fizzBuzz(int n) {
        return new AbstractList<>() {
            @Override
            public String get(int i) {
                return switch ((i + 1) % 15) {
                    case 0 -> "FizzBuzz";
                    case 3, 6, 9, 12 -> "Fizz";
                    case 5, 10 -> "Buzz";
                    default -> String.valueOf(i + 1);
                };
            }

            @Override
            public int size() {
                return n;
            }
        };
    }
}
