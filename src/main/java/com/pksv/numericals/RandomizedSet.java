package com.pksv.numericals;

import java.util.*;

class RandomizedSet {

    private final List<Integer> list;
    private final Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        return list.add(val);
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        list.remove((Integer) val);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

class Test {
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        /*System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());*/
        /*System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());*/

//        ["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
//        [[],                  [0],    [1],    [0],    [2],        [1]     ,[]]

        System.out.println(set.insert(0));
        System.out.println(set.insert(1));
        System.out.println(set.remove(0));
        System.out.println(set.insert(2));
        System.out.println(set.remove(1));
        System.out.println(set.getRandom());

    }
}