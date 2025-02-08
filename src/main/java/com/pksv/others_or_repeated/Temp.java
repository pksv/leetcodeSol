package com.pksv;

public class Temp {
    public static void main(String[] args) {
        Temp temp = new Temp();
        String s = "AAA";
        System.out.println(temp.magicPotion(s));

//        int[] nums = {19, 8, 7, 1, 5, 4, 3, 2, 4, 5, 6, 7, 8, 0, 7, 6, 5, 4, 10};
//        System.out.println("second smallest = " + temp.secondSmallest(nums));
//        System.out.println("second largest = " + temp.secondLargest(nums));
    }

    private int magicPotion(String s) {
        return solve(s, s.length() - 1);
    }

    private int solve(String s, int i) {
        if (i < 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        if ((i + 1) % 2 == 0) {
            String s1 = s.substring(0, i / 2 + 1);
            String s2 = s.substring(i / 2 + 1, i + 1);
            System.out.println("s1: " + s1 + " s2: " + s2);
            if (s1.equals(s2)) {
                ans = 1 + solve(s, i / 2);
            }
        }
        ans = Math.min(ans, 1 + solve(s, i - 1));
        return ans;
    }


    private int secondSmallest(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < secondSmallest) {
                secondSmallest = num;
            }
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
        }
        return secondSmallest;
    }

    private int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > secondLargest) {
                secondLargest = num;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
        }
        return secondLargest;
    }
}
