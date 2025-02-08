package com.pksv.arrays;

import java.util.TreeMap;

public class MyCalendar {
    TreeMap<Integer, Integer> timeLine;

    public MyCalendar() {
        timeLine = new TreeMap<>();
    }

    public static void main(String[] args) {
//        [[],[10,20],[15,25],[20,30]]
        MyCalendar calendar = new MyCalendar();
//        System.out.println(calendar.book(10, 20));
//        System.out.println(calendar.book(15, 25));
//        System.out.println(calendar.book(20, 30));

//        [[],[37,50],[33,50],[4,17],[35,48],[8,25]]
        System.out.println(calendar.book(37,50));
        System.out.println(calendar.book(33,50));
        System.out.println(calendar.book(4,17));
        System.out.println(calendar.book(35,48));
        System.out.println(calendar.book(8,25));


    }

    public boolean book(int start, int end) {
        if (timeLine.containsKey(start)) return false;

        var f = timeLine.floorKey(start);
        var c = timeLine.ceilingKey(start);

        if (f != null && timeLine.get(f) > start) return false;
        if (c != null && c < end) return false;

        timeLine.put(start, end);
        return true;
    }
}
