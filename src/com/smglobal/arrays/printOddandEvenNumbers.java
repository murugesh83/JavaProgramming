package com.smglobal.arrays;

public class printOddandEvenNumbers {

    public static void main(String[] args){

        int[] arr=new int[]{1,3,2,4,4,2,7,8,9,10};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
        }

    }
}
