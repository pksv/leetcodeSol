package com.pksv;

import java.util.Arrays;

public class HandOfStraights {
    public static void main(String[] args) {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
//        int[] hand = {1, 2, 3, 4, 5};
//        int[] hand = {8, 10, 12};
        System.out.println(new HandOfStraights().isNStraightHand(hand, 3));
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        int curr = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != -1) {
                int count = 0;
                for (int j = i; j < hand.length && count < groupSize; j++) {
                    if (count == 0 || (hand[j] != -1 && hand[j] == curr + 1)) {
                        curr = hand[j];
                        hand[j] = -1;
                        count++;
                    }
                }
                if (count < groupSize) {
                    return false;
                }
            }
        }
        for (int i : hand) {
            if (i != -1) {
                return false;
            }
        }

        return true;
    }
}
