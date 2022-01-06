package com.smglobal.test;

public class FindMaxAndMinNumber {

    public static void main(String[] args){
        int[] arr=new int[]{3, 7, 43,4,5,34, 56};

        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max number : "+max);


        int min = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The min number : "+min);
    }
}
