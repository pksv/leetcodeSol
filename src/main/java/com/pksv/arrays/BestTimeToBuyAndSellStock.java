package com.pksv.arrays;

import java.util.Stack;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {1, 2};
//        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfitBuyOnceSellOnce(prices));
    }

    public int maxProfit(int[] prices) {
        int cp = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1 && cp != 0) {
                profit = profit + prices[i] - cp;
//                System.out.println("condition 1: profit = " + profit + " prices[i] = " + prices[i] + " cp = " + cp);
                break;
            }
            if (i + 1 < prices.length) {
                if (prices[i] < prices[i + 1] && cp == 0) {
                    cp = prices[i];
//                    System.out.println("condition 2: profit = " + profit + " prices[i] = " + prices[i] + " cp = " + cp);
                }
                if (prices[i] > prices[i + 1] && cp != 0) {
                    profit = profit + prices[i] - cp;
                    cp = 0;
//                    System.out.println("condition 3: profit = " + profit + " prices[i] = " + prices[i] + " cp = " + cp);
                }

            }
        }
        return profit;
    }

    public int maxProfitBuyOnceSellOnce(int[] prices) {
        int cp = Integer.MAX_VALUE;
        Stack<Integer> profits = new Stack<>();
        profits.push(0);

        for (int price : prices) {
            if (price < cp) cp = price;
            if (price > cp) {
                var peeked = profits.peek();
                var profit = price - cp;
                if (peeked < profit) {
                    profits.push(profit);
                }
            }
        }

        return profits.pop();
    }
}
