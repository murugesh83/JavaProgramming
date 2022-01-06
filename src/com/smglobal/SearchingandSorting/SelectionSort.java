package com.smglobal.SearchingandSorting;

public class SelectionSort {

    public  static void main(String[] args){
        int[] arr=new int[]{12,3, 5,6,45, 33};

        for (int i=0; i<arr.length; i++){

            for (int j=i+1; j<arr.length; j++){

                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int value : arr)
        System.out.print(value+" ");


    }

}
