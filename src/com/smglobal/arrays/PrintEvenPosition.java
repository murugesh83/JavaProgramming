package com.smglobal.arrays;

//Program to print the elements of an array present on even position
public class PrintEvenPosition {

    public static void main(String[] args){
        int[] arr = new int[10];

        for(int l=0; l< arr.length; l++){
            arr[l] = l;
            System.out.print(arr[l]+" ");
        }
        System.out.println();

        //odd number
        for(int i=0; i<arr.length; i=i+2){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        //even number
        for(int i=1; i<arr.length; i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}
