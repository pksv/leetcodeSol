package com.pksv.arrays;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        System.out.println(new MinimumNumberOfMovesToSeatEveryone().minMovesToSeat(seats, students));
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        if (seats.length != students.length) return -1;
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += (Math.abs(students[i] - seats[i]));
        }
        return moves;
    }
}
