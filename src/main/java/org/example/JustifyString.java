package org.example;

import java.util.Arrays;

public class JustifyString {

    public static void main(String[] args) {
//        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
//        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 20;
        var x = justification(words, maxWidth);
        Arrays.stream(x).forEach(System.out::println);
    }

    public static String[] justification(String[] words, int maxWidth) {
        String[] temp = new String[words.length];
        int counter = 0;
        temp[counter] = "";
        for (String word : words) {
            if ((temp[counter] + word).length() > maxWidth) {
                temp[++counter] = "";
            }
            temp[counter] = (temp[counter] + " " + word).trim();
        }

        return justifyLine(temp, maxWidth, counter + 1);
    }

    public static String[] justifyLine(String[] temp, int maxWidth, int counter) {
        String[] res = new String[counter];
        for (int i = 0; i < temp.length; i++) {
            String w = temp[i];
            if (w != null) {
                if (i != counter - 1) {
                    if (w.contains(" ")) {
                        var x = w.split(" ");
                        while (w.length() < maxWidth) {
                            for (int j = 0; j < x.length - 1; j++) {
                                x[j] = x[j] + " ";
                                if (toString(x).length() == maxWidth) break;
                            }
                            w = toString(x);
                        }
                    } else {
                        w = String.format("%-" + maxWidth + "s", w);
                    }
                } else {
                    w = String.format("%-" + maxWidth + "s", w);
                }
                res[i] = w;
            }
        }
        return res;
    }

    public static String toString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.toString();
        }
    }
}