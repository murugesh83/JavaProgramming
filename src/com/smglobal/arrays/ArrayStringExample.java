package com.smglobal.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStringExample {

    public static void main(String[] args){
        String[] greeting=new String[3];
        Integer[] integers=new Integer[10];

        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";

        ArrayList<String> stringArrayList=new ArrayList<>();

        for (String str:greeting) {
            System.out.println(str);
        }

        String[] arr = new String[] {"Tutorials", "Point", ".com"};
        System.out.println(Arrays.toString(arr));

        String[][] arrays=new String[][]{{"Sai", "Sanjit"}, {"Anbu", "Murugesh"}};
      // System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.deepToString(arrays));

        for(int i=0; i<10; i++) {
            int value = i;
            integers[i]= value+10;
        }
        for (int val : integers) {
            System.out.print("  "+val);
        }
    }
}
