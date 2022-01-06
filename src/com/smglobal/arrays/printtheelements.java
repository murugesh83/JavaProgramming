package com.smglobal.arrays;

//print the elements Program to print the elements of an array
public class printtheelements {

    public static void main(String[] args){

        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int i=0; i<arr.length; i++){
            System.out.println(i+"  "+arr[i]);
        }
    }
}
