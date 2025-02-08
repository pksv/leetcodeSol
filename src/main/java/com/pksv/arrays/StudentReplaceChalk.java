package com.pksv.arrays;

import java.io.FileNotFoundException;

//Find the Student that Will Replace the Chalk
public class StudentReplaceChalk {
    public static void main(String[] args) {
//        int[] chalk = {5, 1, 5};
        int[] chalk;
        try {
            chalk = Input.getInput();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int k = 182037067;
        System.out.println(new StudentReplaceChalk().chalkReplacer(chalk, k));
    }

    public int chalkReplacer(int[] chalk, int k) {
//        int sum = Arrays.stream(chalk).sum();
        int sum = 0;
        for (var i : chalk) {
            sum += i;
            if (sum > k) {
                break;
            }
        }
        k %= sum;

        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            } else {
                k -= chalk[i];
            }
        }
        return 0;
    }
}
