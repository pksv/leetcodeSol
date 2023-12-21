package org.example.queensAttack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObstaclesClass {
    public List<List<Integer>> getObstacles() throws FileNotFoundException {
        List<List<Integer>> obstacles = new ArrayList<>();

        File z = new File("D:\\1111\\github\\interview\\src\\main\\java\\org\\example\\queensAttack\\input");
        Scanner scanner = new Scanner(z);
        while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            var y = x.split(" ");
            var v1 = Integer.parseInt(y[0]);
            var v2 = Integer.parseInt(y[1]);
            List<Integer> obstacle = new ArrayList<>();
            obstacle.add(v1);
            obstacle.add(v2);
            obstacles.add(obstacle);
        }
        return obstacles;
    }
}