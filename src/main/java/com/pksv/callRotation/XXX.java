package com.pksv.callRotation;

import java.util.ArrayList;
import java.util.List;

public class XXX {
    public static void main(String[] args) {
        int MAX_TIME = 24;
        List<List<Integer>> timeRange = new ArrayList<>();
        for (int i = 0; i < MAX_TIME; i++) {
            timeRange.add(new ArrayList<>());
        }

        List<Schedule> data = new ArrayList<>();
        data.add(new Schedule("Abby", 1, 10));
        data.add(new Schedule("Ben", 5, 7));
        data.add(new Schedule("Carla", 6, 12));
        data.add(new Schedule("David", 15, 17));
        int n = data.size();

        for (int i = 0; i < n; i++) {
            Schedule s = data.get(i);
            timeRange.get(s.start).add(i + 1);
            timeRange.get(s.end).add(-(i + 1));
        }

        List<String> onCall = new ArrayList<>();
        int prevTime = 0;
        while (timeRange.get(prevTime).isEmpty()) {
            prevTime++;
        }

//        timeRange.get(prevTime).get(0);

        for (int i : timeRange.get(prevTime)) {
            onCall.add(data.get(i - 1).name);
        }

        for (int time = prevTime + 1; time < MAX_TIME; time++) {
            if (!timeRange.get(time).isEmpty()) {
                if (!onCall.isEmpty()) {
                    System.out.print(prevTime + " " + time + " ");
                    for (String s : onCall) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
                for (int i : timeRange.get(time)) {
                    if (i >= 0) {
                        onCall.add(data.get(i - 1).name);
                    } else {
                        int index = -(i) - 1;
                        onCall.remove(data.get(index).name);
                    }
                    prevTime = time;
                }
            }
        }
    }
}


