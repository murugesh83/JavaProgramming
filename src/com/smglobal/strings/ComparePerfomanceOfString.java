package com.smglobal.strings;

public class ComparePerfomanceOfString {

    public static void main(String[] args){
        long time1 = System.currentTimeMillis();

        for (int i=0; i<50000; i++){
            String str1 = "Hello";
            String str2 ="Hello";
        }

        long time2 = System.currentTimeMillis();

        System.out.println("Time taken for creation"
                + " of String literals : "+ (time2 - time1)
                + " milli seconds" );

        long timeTest = System.currentTimeMillis();

        for (int i=0; i<50000; i++){
            String str1 = "Hello";
            String str2 ="Hello";
        }

        long timeTest2 = System.currentTimeMillis();

        System.out.println("Time taken for creation"
                + " of String literals : "+ (timeTest2 - timeTest)
                + " milli seconds" );
    }
}
