package com.smglobal.arrays;

public class ThirdLargestNumberinanArray {

    public static void main(String[] args){

        int[] arr = new int[]{3, 5, 4, 2,1, 6};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Third Second number : "+arr[1]);
        System.out.println("Third lastest number : "+arr[2]);
        System.out.println("The Lastest number : "+arr[arr.length-1]);
        System.out.println("The Smallest  number : "+arr[0]);
    }
}
