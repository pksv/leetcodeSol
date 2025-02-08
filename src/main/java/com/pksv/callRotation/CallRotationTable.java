package com.pksv.callRotation;

import java.util.ArrayList;
import java.util.List;

public class CallRotationTable {
    public static void main(String[] args) {
        List<Schedule> schedules = List.of(
                new Schedule("Abby", 3, 10),
                new Schedule("Ben", 5, 7),
                new Schedule("Carla", 6, 12),
                new Schedule("David", 15, 17)
        );

        var sol = new CallRotationTable().solve(schedules);
        for (var s : sol) {
            System.out.println(s);
        }
    }

    public List<ScheduleAns> solve(List<Schedule> data) {
        int MAX_TIME = 24;
        List<List<Integer>> timeRange = new ArrayList<>();
        for (int i = 0; i < MAX_TIME; i++) {
            timeRange.add(new ArrayList<>());
        }

        for (int i = 0; i < data.size(); i++) {
            Schedule s = data.get(i);
            timeRange.get(s.start).add(i + 1);
            timeRange.get(s.end).add(-(i + 1));
        }

        List<String> onCall = new ArrayList<>();
        int prev = 0;

        List<ScheduleAns> result = new ArrayList<>();
        for (int time = 0; time < MAX_TIME; time++) {
            if (!timeRange.get(time).isEmpty()) {
                if (!onCall.isEmpty()) {
                    ScheduleAns ans = new ScheduleAns(new ArrayList<>(onCall), prev, time);
                    result.add(ans);
                }
                for (var i : timeRange.get(time)) {
                    if (i >= 0) {
                        onCall.add(data.get(i - 1).name);
                    } else {
                        onCall.remove(data.get(-(i) - 1).name);
                    }
                    prev = time;
                }
            }
        }
        return result;
    }
}
