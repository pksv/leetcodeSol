package com.pksv.others_or_repeated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{
                0, 0, 1, 0, 1}, {
                1, 0, 0, 1, 1}, {
                0, 0, 0, 0, 0}, {
                0, 1, 0, 0, 1}};
//        int[][] arr = {{
//                1, 1, 1}, {
//                1, 1, 1}, {
//                1, 1, 1}};
//        System.out.println(new Main().temp(arr));

//        System.out.println(new Main().forthHighest(List.of(1,2,3,4,5,6,7,8,9,10)));

        int[] a = {1000000, 7, 3, 2, 1}, b = {4, 1, 2};
        System.out.println(new Main().merge(a,b));
    }

    public void te() {
        int a = -8;
        int i = (-a) >>> 2;
        int b = a >>> 2;
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);

        byte num1 = 8;
        byte num2 = -8;

        System.out.println(num1 >>> 2);
        System.out.println(num2 >>> 2);
    }

    public static void temp() {
        List<Integer> list = List.of(5, 6, 7, 8, 9, 11, 12);
        int start = 0;
        int end = list.size() - 1;


        while (start >= 0 && end < list.size() && start < end) {
            int mid = (start + end) / 2;
            if (list.get(mid - 1) + 1 == list.get(mid)
                    && list.get(mid) + 1 != list.get(mid + 1)) {
                System.out.println(mid + 1);
                break;
            }
            if (list.get(mid) + 1 != list.get(mid + 1)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public List<Integer> merge(int[] a, int[] b) {
        return Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed())
                .distinct().sorted().collect(Collectors.toList());
    }

//     4th highest in a list/array

    public int forthHighest(List<Integer> list) {
        return (int) list.stream().sorted(Comparator.reverseOrder())
                .limit(4).toArray()[3];
    }

}