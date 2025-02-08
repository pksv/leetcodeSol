package com.pksv.arrays;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {
        int count = 0;
        for (var detail : details) {
            if (detail.charAt(11) > '6' || (detail.charAt(11) == '6' && detail.charAt(12) >= '1')) {
                count++;
            }
        }
        return count;
    }
}
