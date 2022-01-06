package com.smglobal.strings;

import java.util.Arrays;
import java.util.HashMap;

public class Exmaple {

    //Given an array, find the first and duplicate element
    public static void main(String[]  args) {

            example();
    }

    private static int[] occurTarget() {
        int[] intArr = new int[]{3, 5, 7, 6, 4, 6, 6, 1};
        int[] tempArr = new int[intArr.length];
        int target = 10;

        for (int i = 0; i < intArr.length - 1; i++) {
            int value = intArr[i] + intArr[i + 1];
            if (value == target) {
                tempArr[i] = value;
            }
        }

        for (int i=0; i< tempArr.length-1; i++){
            if(tempArr[i]==10)
                System.out.println("Index "+i+"  Value "+intArr[i]);
        }
        return tempArr;
    }

    private void fristOccuredDuplicate()
    {
        int[] intArr = new int[] {111, 333, 333, 777, 444, 555 , 333,666};

        int duplicate = 0;
        boolean duplicatoccured = false;
        int index = 0;
        for (int i =0; i<intArr.length-1; i++) {
            if(duplicatoccured)
            {
                break;
            }
            for (int j=i+1; j<intArr.length; j++){
                if(intArr[i]== intArr[j]){
                    duplicate = intArr[i];
                    index = j;
                    duplicatoccured = true;
                    break;
                }
            }


        }
        System.out.println(index);
        System.out.println(duplicate);

    }

    //Program to print the no. of occurrences of a given character or all letters in a string.
    private static void example()
    {
        String str ="How are you? Hope you are doing fine";

        HashMap<Character, Integer> integerHashMap=new HashMap<>();
        for (int i = 0; i< str.length()-1; i++){
            char key = str.charAt(i);
            if(key == 'e') {
                if (key != ' ') {
                    int value = 1;
                    boolean flag = integerHashMap.containsKey(key);
                    if (flag == true) {
                        value = integerHashMap.get(key) + 1;
                    }
                    integerHashMap.put(key, value);
                }
            }
        }

        for (char key : integerHashMap.keySet()) {
            System.out.println(key+ "  occured times "+integerHashMap.get(key));
        }

    }
}
