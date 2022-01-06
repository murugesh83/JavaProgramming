package com.smglobal.Logic;

import com.smglobal.arrays.SortAsc;

import java.util.Arrays;

public class FibonacciNumber {

    public static void main(String[] args){

       int[]  arr=new int[]{3,4,6,7,8,3,6,8};
       int temp = 0;

        int[]  tempArr=new int[arr.length];
       for (int i=0; i<arr.length; i++){
           for (int j=i+1; j<arr.length; j++){
               if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
               tempArr[i] = arr[i];
               boolean flag = Arrays.asList(tempArr).contains(arr[i]);
               System.out.println(flag);
               if(!flag){
                   tempArr[i] = arr[j];
               }
           }

       }

        for (int value : tempArr) {
            System.out.println(value+" ");
        }

    }

    private static void Fibonicci()
    {
        int n = 1;
        int a =0;
        int b = 1;
        int temp = 0;



        if(n == a){
            System.out.println(a);
            return;
        }else
        if(n == b){
            System.out.println(a);
            System.out.println(b);
            return;
        }
        System.out.println(a);
        System.out.println(b);

        for(int i=0; i<10; i++){
            temp = a + b;
            System.out.println(temp);
            a =  b;
            b = temp;

        }

    }


}
