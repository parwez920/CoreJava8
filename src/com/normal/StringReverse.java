package com.normal;

public class StringReverse {

    public static void stringRev(String str){
        String  reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)){
            System.out.println("palidrom String "+ reverse);
        }else {
            System.out.println("not palidrom String " + reverse);
        }
    }

    public static void main(String[] args) {
        stringRev("madam");
    }
}
