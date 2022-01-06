package com.smglobal.arrays;

import java.util.HashMap;

//Program to find the frequency of each element in the array
public class findthefrequencyofeach {

    public static void main(String[] args){
        int[] arr ={1, 2, 8, 3, 2, 2, 2, 5, 1 };

        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int value = 1;
            boolean flag = hashMap.containsKey(key);
            if(flag == true){
                value = hashMap.get(key)+1;
            }
            hashMap.put(key, value);
        }

        for (int key: hashMap.keySet()) {
            System.out.println(key +"   times :"+hashMap.get(key));
        }
    }




}
