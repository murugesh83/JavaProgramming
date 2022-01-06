package com.smglobal.algorithm.sort;

import java.util.Arrays;

public class SelectionBubbleSort {

    public static void main(String[] args){

        bubbleSort();
        //selectionSort();
    }

    private static void selectionSort(){

        int[] arr = new int[]{22, 33, 45, 1, 3, 99, 44};

        int mLength =  arr.length;
        for(int i=0; i<mLength-1; i++){
            int min_idx = i;
            for(int j=i+1; j<mLength; j++){
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(){

        int[] arr = new int[]{22, 33, 45, 1, 3, 99, 44};

        int mLength =  arr.length;
        for(int i=0; i<mLength-1; i++){
            for(int j=i+1; j<mLength; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
