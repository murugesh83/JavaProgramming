package com.smglobal.test;

public class PrintFirstDuplicateValue {

    public static void main(String[] args){

        int[] intArr = new int[] {111, 333, 333, 777, 444, 555 , 333,666};

        for(int i=0; i<intArr.length-1; i++){
            for(int j=i+1; j<intArr.length; j++){
                if(intArr[i] == intArr[j]){
                    System.out.println("Duplicate occured "+intArr[i]);
                    break;
                }
            }
        }
    }
}
