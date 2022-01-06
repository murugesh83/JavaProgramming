package com.smglobal.arrays;

import java.util.Arrays;

public class rightrotatetheelementsofanarray {

    public  static void main(String[] args){

        int arr[] ={1, 2, 3, 4, 5 };
        for(int i = 0; i < 3; i++) {

            //Stores the last element of array
            int last = arr[arr.length - 1];

            for ( int j = arr.length - 1; j > 0; j--) {

                arr[j] = arr[j - 1];
                System.out.println(Arrays.toString(arr) + " ");
            }

            arr[0] = last;
        }

        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }

    }


}
