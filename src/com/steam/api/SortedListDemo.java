package com.steam.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(8);
        list.add(4);
        list.add(18);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
    }
}
