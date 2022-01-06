package com.smglobal.test;

public class SelectionSort {


    public static void main(String[] args){
        int[] arr =new int[]{3, 1,2, 4, 5};

        int arrLength = arr.length;

        for(int i=0; i<arrLength-1; i++){
           for(int j=i+1; j<arrLength; j++){
               if(arr[i] > arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }

    }



}
