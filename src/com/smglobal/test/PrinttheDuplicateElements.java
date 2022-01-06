package com.smglobal.test;

public class PrinttheDuplicateElements {

    public static void main(String[] args){
        int[] arrList=new int[]{2,3,43,3,4,3,4,5,2,4,3};


        for (int i=0; i<arrList.length; i++){
            for (int j= i+1; j<arrList.length; j++){
                if(arrList[i] == arrList[j]) {
                    System.out.print(arrList[i]+" ");
                }
            }

        }
    }
}
