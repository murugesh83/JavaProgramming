package com.smglobal.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElementinArray {

    public static void main(String[] args){

        int[] arr=new int[]{3, 4, 2, 35, 66, 5, 6, 5, 2, 5, 4};

        ArrayList<Integer> tempArr= new ArrayList<>(arr.length);


        for(int i=0; i<arr.length-1; i++){
                if(arr[i] != arr[i+1]){
                    if(!tempArr.contains(arr[i]))
                     tempArr.add(arr[i]);
                }
        }

        for (int k=0; k<tempArr.size(); k++){
            System.out.print(tempArr.get(k)+" ");
        }

    }
}
