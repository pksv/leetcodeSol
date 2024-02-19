package com.pksv.adobe;

public class FindNeedle {
    public static void main(String[] args) {
        String hackCock = "";
        String needle = "";
        FindNeedle fn = new FindNeedle();
        int j = fn.findNeedle(hackCock, needle);
        System.out.println(j);
    }

    private int findNeedle(String hackCock, String needle) {
        return hackCock.indexOf(needle);
    }


}
