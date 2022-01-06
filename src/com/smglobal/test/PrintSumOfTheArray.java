package com.smglobal.test;

public class PrintSumOfTheArray {

    public static void main(String[] args){

        int[] listArr =new int[]{1,3,4,5,6};
        int sum = 0;
        for(int i=0; i<listArr.length; i++){
            sum = sum +listArr[i];
        }

        System.out.println("Sum of the Arrays is : "+sum);
    }
}
