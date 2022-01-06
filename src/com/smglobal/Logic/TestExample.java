package com.smglobal.Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class TestExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        //sorting

        int length = arr.length;

       /* for(int i=0; i<length; i++){
            for (int j=i+1; j<length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/

        /*for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i]> arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
*/

        ArrayList<Integer> arrTemp = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            //for (int j=i+1; j< arr.length-1; j++){
            if (arr[i] != arr[i + 1]) {
                if(!arrTemp.contains(arr[i]))
                    arrTemp.add(arr[i]);
            }

        }


        for (int j = 0; j < arrTemp.size(); j++) {
         //   System.out.print(arrTemp.get(j) + ", ,, ");
        }

        //Convert Arraylist to int Array


        int[] ret = new int[arrTemp.size()];

        for(int i=0; i<arrTemp.size(); i++){
            ret[i] = arrTemp.get(i);
        }

        for (int j = 0; j < ret.length; j++) {
         //   System.out.print(ret[j] + ", ");
        }

        System.out.println(Arrays.asList(arrTemp));

    }
}
