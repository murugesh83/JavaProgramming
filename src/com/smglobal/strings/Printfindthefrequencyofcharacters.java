package com.smglobal.strings;

import java.util.HashMap;

public class Printfindthefrequencyofcharacters {

    public static void main(String[] args){
        String str = "picture perfect";

        char[]  strCharArr= str.toCharArray();
        int count =1;
        HashMap<Character, Integer> hashMap =new HashMap<>();
        for (int i=0; i<strCharArr.length; i++){
            char key = strCharArr[i];
            if(key !=' ') {
                boolean flag = hashMap.containsKey(key);
                count = 1;
                if (flag == true) {
                    count = hashMap.get(key) + 1;
                }
                hashMap.put(key, count);
            }
        }

        for (char key: hashMap.keySet()) {
            System.out.println("Key : "+key+"     "+hashMap.get(key));
        }
    }
}
