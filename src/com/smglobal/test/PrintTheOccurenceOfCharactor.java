package com.smglobal.test;

import java.util.HashMap;

public class PrintTheOccurenceOfCharactor {

    public static void main(String[] args){

        String str ="How are you? Hope you are doing fine";

        HashMap<Character, Integer> integerHashMap=new HashMap<>();

        for(int i =0; i<str.length(); i++){

            char key = str.charAt(i);
            if(key != ' ') {
                int value = 1;
                boolean flag = integerHashMap.containsKey(key);
                if (flag == true) {
                    value = integerHashMap.get(key) + 1;
                }
                integerHashMap.put(key, value);
            }
        }

        for (char key : integerHashMap.keySet()) {
            System.out.println("Key : "+key +"  Value "+integerHashMap.get(key));
        }

    }
}
