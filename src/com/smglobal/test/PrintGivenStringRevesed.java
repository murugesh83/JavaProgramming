package com.smglobal.test;

public class PrintGivenStringRevesed {

    public static void main(String[] args){

        String string = "Dream big";

        char[] charArr= string.toCharArray();
        System.out.println(charArr.length);

        for(int i=charArr.length-1; i>=0; i--){
            System.out.print(charArr[i]);
        }
    }
}
