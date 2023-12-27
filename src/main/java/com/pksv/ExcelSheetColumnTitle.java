package com.pksv;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(701));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            char c = (char) (((columnNumber - 1) % 26) + 65);
            res.append(c);
            columnNumber = (columnNumber - 1) / 26;
        }
        return res.reverse().toString();
    }
}
