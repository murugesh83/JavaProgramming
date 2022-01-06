package com.smglobal.SearchingandSorting;

public class BubbleSort {

    public static void main(String[] args){

        int[] arr=new int[]{12,3, 5,6,45};

        for (int value : arr){
            System.out.print(value+", ");
        }
        int temp = 0;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int value : arr){
            System.out.print(value+", ");
        }
    }
}
