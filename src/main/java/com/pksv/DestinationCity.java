package com.pksv;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
//        paths.add(List.of("London", "New York"));
//        paths.add(List.of("New York", "Lima"));
//        paths.add(List.of("Lima", "Sao Paulo"));

//        paths.add(List.of("qMTSlfgZlC", "ePvzZaqLXj"));
//        paths.add(List.of("xKhZXfuBeC", "TtnllZpKKg"));
//        paths.add(List.of("ePvzZaqLXj", "sxrvXFcqgG"));
//        paths.add(List.of("sxrvXFcqgG", "xKhZXfuBeC"));
//        paths.add(List.of("TtnllZpKKg", "OAxMijOZgW"));

        paths.add(List.of("ZyRLxE xmA", "WQztariTJd"));
        paths.add(List.of("pSoBauoJox", "ZyRLxE xmA"));
        paths.add(List.of("lbEWEqcBKg", "tKsFZosRmT"));
        paths.add(List.of("QfKdgCRgGv", "lbEWEqcBKg"));
        paths.add(List.of("WQztariTJd", "QfKdgCRgGv"));
        paths.add(List.of("tKsFZosRmT", "NhNPVREEsh"));
        System.out.println(new DestinationCity().destCity(paths));
    }

    public String destCity(List<List<String>> paths) {
        Map<String, String> pathMap = new HashMap<>();
        String destination = paths.get(0).get(1);
        for (var path : paths) {
            pathMap.put(path.get(0), path.get(1));
        }
        while (pathMap.containsKey(destination)) {
            destination = pathMap.get(destination);
        }
        return destination;
    }

    public String destCityOpt(List<List<String>> paths) {
        Set<String> start = new HashSet<>();
        for (var path : paths) {
            start.add(path.get(0));
        }
        for (var path : paths) {
            if (!start.contains(path.get(1))) return path.get(1);
        }
        return "";
    }
}
