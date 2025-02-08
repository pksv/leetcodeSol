package com.pksv.arrays;



//Find the Winner of the Circular Game
public class CircularGame {
    public static void main(String[] args) {
//        int n = 6, k = 5;
//        int n = 5, k = 2;
//        System.out.println(new CircularGame().findTheWinner(n, k));
        new CircularGame().temp();

    }

    public int findTheWinnerTemp(int n, int k) {
        int[] nums = new int[n + 1];
        int i = 1;
        int t = 1;
        int count = 0;
        while (count < n - 1) {
            if (t == k) {
                nums[i]++;
                count++;
            }
            do {
                i = (i + 1) > n ? 1 : i + 1;
            } while (nums[i] > 0);
            t = (t + 1) > k ? 1 : t + 1;
        }
        int res = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == 0) {
                res = j;
                break;
            }
        }
        return res;
    }

    public int findTheWinner(int n, int k) {
        if (n == 1) return 1;
        return (findTheWinner(n - 1, k) + k - 1) % n + 1;
    }

    private void temp() {

    }
}

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}