package com.smglobal.test;

public class LinearSearch {

    public static void main(String[] args){
        int[] arr=new int[]{2, 3, 5,6, 7,8, 9,10};

        int item = 4;
       boolean flag = false;
        for (int i= 0; i<arr.length; i++){
            if(arr[i] == item){
                System.out.println("The item found : "+arr[i]);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("The item not found");
        }
    }
}
