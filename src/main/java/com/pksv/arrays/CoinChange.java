package com.pksv.arrays;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        System.out.println(new CoinChange().coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int rem = amount;
        int noOfCoins = 0;
        for (int i = coins.length - 1; i >= 0 && rem > 0; i--) {
            if (rem >= coins[i]) {
                System.out.println(coins[i] + " " + (rem / coins[i]));
                noOfCoins += (rem / coins[i]);
                rem = rem % coins[i];
            }
        }
        return rem == 0 ? noOfCoins : -1;
    }

}
