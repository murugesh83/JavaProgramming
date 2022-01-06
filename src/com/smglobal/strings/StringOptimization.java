package com.smglobal.strings;

public class StringOptimization {

    public static void main(String[] args){
        String variable[] = new String[50000];

        long starttime0 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
           variable[i] ="s"+i;
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Creation time"
                + " of String literals : "+ (endTime0 - starttime0)
                + " ms" );

        System.out.println();
        long starttime1 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            variable[i] =new String("Hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Creation time"
                + " of String literals : "+ (endTime1 - starttime1)
                + " ms" );

        System.out.println();
        long starttime2 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            variable[i] = new String("Hello");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Creation time"
                + " of String literals : "+ (endTime2 - starttime2)
                + " ms" );

        System.out.println();

        long starttime3 = System.currentTimeMillis();
        for (int i=0; i<50000; i++) {
            variable[i] = new String("Hello");
            variable[i] = variable[i].intern();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Creation time"
                + " of String literals : "+ (endTime3 - starttime3)
                + " ms" );


    }
}
