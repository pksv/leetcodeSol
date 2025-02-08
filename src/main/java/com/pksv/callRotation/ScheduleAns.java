package com.pksv.callRotation;

import java.util.List;

public class ScheduleAns {
    List<String> name;
    int start;
    int end;

    public ScheduleAns(List<String> name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " " + end + " " + name;
    }
}
