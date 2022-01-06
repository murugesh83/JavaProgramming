package com.smglobal.arrays;

public class CopyArray {

    //Program to copy all elements of one array into another array
    public static void main(String[] args){

        int[] firstArr=new int[]{1,2,4,5, 6, 7};

        int[] copyArr= new int[firstArr.length];

        for (int i=0; i<firstArr.length; i++){
            copyArr[i] = firstArr[i];
        }

        for (int value : firstArr) {
            System.out.print(value+", ");
        }
        System.out.println();
        for (int value : copyArr) {
            System.out.print(value+", ");
        }
    }
}
