package com.smglobal.test;

import java.util.HashMap;

public class FindTheFrequenceyOfEach {

    public static void main(String[] args){

        int[] arr= {2,3,3,2,1,3,5,4,6,7};

        HashMap<Integer, Integer> hashMap=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int value = 1;
            boolean keyExist = hashMap.containsKey(key);
            if(keyExist == true){
                value = hashMap.get(key)+1;
            }
            hashMap.put(key, value);
        }

        for (int key : hashMap.keySet()){
            System.out.println("Key :" +key +"   value times :"+hashMap.get(key));
        }

    }
}
