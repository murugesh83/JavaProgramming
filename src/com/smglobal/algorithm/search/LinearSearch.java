package com.smglobal.algorithm.search;

public class LinearSearch {

    public  static void main(String[] args){

        int[] arr = new int[]{22, 33, 45, 1, 3, 99};

        int item = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == item){
                System.out.println(item+" found in location of "+ i);
                break;
            }
        }

    }
}
