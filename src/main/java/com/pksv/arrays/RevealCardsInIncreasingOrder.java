package com.pksv.arrays;

import java.util.Arrays;

public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        int[] deck = {2, 3, 5, 7, 11, 13, 17, 19, 21, 22, 23, 24};
        System.out.println(Arrays.toString(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(deck)));
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Arrays.sort(deck);
        int resultIndex = 0;
        int deckIndex = 0;
        boolean skip = true;
        while (deckIndex < n) {
            if (result[resultIndex] == 0) {
                if (skip) {
                    result[resultIndex] = deck[deckIndex++];
                }
                skip = !skip;
            }
            resultIndex = (resultIndex + 1) % n;
        }
        return result;
    }
}
