package org.example.queensAttack;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class QueensAttack {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static void main(String[] args) {
        try {
            List<List<Integer>> obstacls = new ObstaclesClass().getObstacles();
            List<List<Integer>> obstacles = new ArrayList<>();
            var o1 =new ArrayList<Integer>();
            o1.add(5);
            o1.add(5);
            var o2 =new ArrayList<Integer>();
            o2.add(4);
            o2.add(2);
            var o3 = new ArrayList<Integer>();
            o3.add(2);
            o3.add(3);


            obstacles = List.of(o1, o2, o3);

//            var x = queensAttack(100000, 100000, 6453, 3654, obstacls);
//            var x = queensAttack(100000, 100000, 2816, 9745, obstacls);
            var x = queensAttack(1000, 10000, 400, 477, obstacls);
            var y = queensAttack(5, 3, 4, 3, obstacles);
            System.out.println(x);
            System.out.println(y);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        var obs = new HashSet<>(obstacles);
        Set<List<Integer>> positions = new HashSet<>();

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        boolean flag8 = false;

        for (int i = 1; i <= n; i++) {

            var c1 = c_q - i;
            var c2 = c_q + i;
            var r1 = r_q - i;
            var r2 = r_q + i;

            flag1 = addPosition(n, r_q, c1, positions, obs, flag1);
            flag2 = addPosition(n, r_q, c2, positions, obs, flag2);
            flag3 = addPosition(n, r1, c_q, positions, obs, flag3);
            flag4 = addPosition(n, r2, c_q, positions, obs, flag4);
            flag5 = addPosition(n, r1, c1, positions, obs, flag5);
            flag6 = addPosition(n, r2, c2, positions, obs, flag6);
            flag7 = addPosition(n, r2, c1, positions, obs, flag7);
            flag8 = addPosition(n, r1, c2, positions, obs, flag8);
        }
        return positions.size();
    }

    private static boolean addPosition(int n, int row, int col, Set<List<Integer>> positions, Set<List<Integer>> obstacles, boolean flag) {
        var position = new ArrayList<Integer>();
        position.add(row);
        position.add(col);
        if (!flag && obstacles.contains(position)) flag = true;
        var condition = col <= n && col >= 1 && row <= n && row >= 1;
        if (!flag && condition) positions.add(position);
        return flag;
    }

    private static void printList(Set<List<Integer>> list) {
        list.forEach(item -> System.out.println("r = " + item.get(0) + " c = " + item.get(1)));
        System.out.println();
    }
}
