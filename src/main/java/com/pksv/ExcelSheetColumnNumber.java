package com.pksv;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZY"));
    }

    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res = res * 26 + ((int) columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }
}
