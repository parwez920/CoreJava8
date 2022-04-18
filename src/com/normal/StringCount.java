package com.normal;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

    public static void stringCount(String str){
//        str.replace(" ","");
        Map<Character,Integer> map = new HashMap<>();
        for (char ch:str.toCharArray()){
            if (map.containsKey(ch)){

                map.put( ch,map.get(ch+1));
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
               stringCount("getmapping");
    }
}
