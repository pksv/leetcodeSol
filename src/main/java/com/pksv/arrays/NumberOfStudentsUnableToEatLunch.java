package com.pksv.arrays;

public class NumberOfStudentsUnableToEatLunch {

    public static void main(String[] args) {
//        int[] students = {1, 1, 0, 0};
//        int[] sandwiches = {0, 1, 0, 1};
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
//        int[] students = {0, 0, 0, 1, 1, 1, 1, 0, 0, 0};
//        int[] sandwiches = {1, 0, 1, 0, 0, 1, 1, 0, 0, 0};
        System.out.println(new NumberOfStudentsUnableToEatLunch().countStudents(students, sandwiches));
    }

    public int countStudents(int[] students, int[] sandwiches) {
        int c = 0;
        int s = 0;
        for (int student : students) {
            if (student == 0) {
                c++;
            }
            if (student == 1) {
                s++;
            }
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 1 && s > 0) {
                s--;
            } else if (sandwich == 0 && c > 0) {
                c--;
            } else return c + s;
        }
        return 0;
    }
}
