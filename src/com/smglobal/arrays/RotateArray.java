package com.smglobal.arrays;

public class RotateArray {


    public static void main(String[] args){

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

        int temp1 = arr[0];
        int length = arr.length-1;
        for (int i= length-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = temp1;

        }


    }

}
