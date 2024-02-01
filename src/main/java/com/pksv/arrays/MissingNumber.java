package com.pksv.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
//        int[] nums = {3, 0, 1};
        var x = new MissingNumber();
        int[] nums;
        try {
            nums = x.getObstacles();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        var z = x.missingNumber(nums);
        System.out.println("result = " + z);
    }

    public int[] getObstacles() throws FileNotFoundException {
        String[] input = new String[]{};
        File z = new File("D:\\1111\\github\\leetcode\\src\\main\\java\\com\\pksv\\arrays\\input");
        Scanner scanner = new Scanner(z);
        while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            input = x.split(",");
        }
        int[] x = new int[input.length + 1];
        for (var inp : input) {
            var a = Integer.parseInt(inp);
            x[a] = a;
        }
        return x;
    }
    public int missingNumber(int[] nums) {
        int sum = 0, as = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            as += nums[i];
        }
        return sum - as;
    }
}
