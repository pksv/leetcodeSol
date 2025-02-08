package com.pksv.others_or_repeated;

import java.util.*;

public class DataStructure {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    public void insert(int value) {
        if (!map.containsKey(value)) {
            map.put(value, list.size());
            list.add(value);
        }
    }

    public void remove(int value) {
        if (map.containsKey(value)) {
            int index = map.remove(value);
            int last = list.size() - 1;
            if (index != last) {
                Collections.swap(list, index, last);
                map.put(list.get(index), index);
            }
            list.removeLast();
        }
    }

    public int search(int value) {
        return map.getOrDefault(value, -1);
    }

    public int random() {
        return list.get(new Random().nextInt(list.size()));
    }
}

class MainClass {
    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        dataStructure.insert(1);
        dataStructure.insert(7);
        dataStructure.insert(5);
        dataStructure.insert(3);
        dataStructure.insert(10);
        dataStructure.insert(8);
        dataStructure.insert(2);
        dataStructure.insert(6);
        dataStructure.insert(4);
        dataStructure.insert(9);

        dataStructure.remove(7);
        dataStructure.remove(8);


        System.out.println(dataStructure.search(1));
        System.out.println(dataStructure.search(2));
        System.out.println(dataStructure.search(3));
        System.out.println(dataStructure.search(4));
        System.out.println(dataStructure.search(5));
        System.out.println(dataStructure.search(6));
        System.out.println(dataStructure.search(7));
        System.out.println(dataStructure.search(8));
        System.out.println(dataStructure.search(9));
        System.out.println(dataStructure.search(10));
    }
}
