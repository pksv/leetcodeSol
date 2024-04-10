package com.pksv.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayLongInput {

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

    public int[] getInput() throws FileNotFoundException {
        File file = new File("D:\\1111\\github\\leetcode\\src\\main\\java\\com\\pksv\\arrays\\input");
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        var input = stringBuilder.toString().split(",");
        int[] x = new int[input.length + 1];
        for (int i = 0; i < input.length; i++) {
            var a = Integer.parseInt(input[i]);
            x[i] = a;
        }
        return x;
    }
}
