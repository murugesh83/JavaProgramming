package com.smglobal.test;

public class PrintTheCountOfTotalNumberOfCharactor {

    public static void main(String[] args){
        String str ="Hello the count the total number of charactor";

        int count =0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= ' '){
                count++;
            }
        }

        System.out.println("The total number of counts : "+count);
    }
}
