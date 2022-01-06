package com.smglobal.arrays;

//Program to print the largest element in an array
public class printlargestelementinanarray {

    public  static void main(String[] args){

        int[] arr =new int[]{25, 11, 7, 75, 56, 2};

        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println();
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
