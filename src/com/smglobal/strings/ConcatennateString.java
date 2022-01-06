package com.smglobal.strings;

public class ConcatennateString {

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 5000; i++) {
            String result = "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for string"
                + "concatenation using + operator : "
                + (endTime - startTime)+ " ms");

        long startTime1 = System.currentTimeMillis();
        StringBuffer result=new StringBuffer();
        for (int i=0; i<5; i++){
            result.append("This is ");
//            result.append("testing the");
//            result.append("difference");
//            result.append("between");
//            result.append("String");
//            result.append("and");
//            result.append("StringBuffer");
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for string"
                + "concatenation using + operator : "
                + (endTime1 - startTime1)+ " ms");
    }
}
