package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoeEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
    list.add("parwez");
    list.add("rehan");
    list.add("puja");
    list.add("moazzam");
    for(String s :list){
        if (s.startsWith("p"))
        System.out.println(s);
    }
   //list.stream().forEach(t->System.out.println(t));
        list.stream().filter(t->t.startsWith("p")).forEach(t->System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"sonu");
        map.put(2,"rehan");
        map.put(3,"fassi");
        map.put(4,"puja");
        //map.forEach((key,value)->System.out.println(key +"  "+ value));
//        map.entrySet().stream().forEach(obj->System.out.println(obj));
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
    }
}
