package com.pksv.arrays;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
//        int [] coins = {1, 2, 5};
//        int amount = 11;
//        Output: 3
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        System.out.println(new CoinChange().coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] res = new int[amount + 1];
        int leastCoin = amount;
        for (int j : coins) {
            leastCoin = Math.min(j, leastCoin);
        }
        Arrays.fill(res, amount + 1);
        res[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin)
                    res[i] = Math.min(res[i], res[i - coin] + 1);
            }
        }
        return res[amount] == amount + 1 ? -1 : res[amount];
    }

}
