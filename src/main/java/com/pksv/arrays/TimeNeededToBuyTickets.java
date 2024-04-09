package com.pksv.arrays;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println(new TimeNeededToBuyTickets().timeRequiredToBuy(tickets, k));
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] < tickets[k]) {
                time += tickets[i];
            } else {
                time += tickets[k] - (i > k ? 1 : 0);
            }
        }
        return time;
    }
}
