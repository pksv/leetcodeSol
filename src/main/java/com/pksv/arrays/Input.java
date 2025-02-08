package com.pksv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public static int[] getInput() throws FileNotFoundException {
        File file = new File("/Users/pushkalavaidya/IdeaProjects/dsaPractice/src/main/java/com/pksv/input.txt");
        Scanner scanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }
        var  input = builder.toString().split(",");
        int[] inputArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            inputArray[i] = Integer.parseInt(input[i]);
        }
        return inputArray;
    }
}
