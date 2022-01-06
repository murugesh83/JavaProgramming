package com.smglobal.strings;

import java.nio.file.FileSystemLoopException;

public class MainStringCompare {

    public static void main(String[] args) {

        //stringCompareEmp();

        stringCompareEqualMethod();
    }


    /*Following example compares two strings by using str compareTo (string), str compareToIgnoreCase(String) and
    str compareTo(object string) of string
    class and returns the ascii difference of first odd characters of compared strings.*/
    public static void stringCompareEmp()
    {
        String firstString  ="Hello";
        String secondString ="Hello";
        Object objString = firstString;

        System.out.println(firstString.compareTo(secondString));
        System.out.println(firstString.compareToIgnoreCase(secondString));
        System.out.println(firstString == secondString);
    }

    public static void stringCompareEqualMethod(){
        String firstString  ="Hello";
        String secondString ="Hello";
        String s3= new String("Hello");

        System.out.println("HJellow");
        if(firstString.equals(secondString)){
            System.out.println("Both are equal " +firstString.equals(secondString));
        }else
        {
            System.out.println("Both are not equal "+firstString.equals(secondString));
        }

        if(firstString == secondString){
            System.out.println("Both are equal ");
        }else
        {
            System.out.println("Both are not equal");
        }

        //String object compares
        if(s3 == firstString){
            System.out.println("Both are equal :******* ");
        }else
        {
            System.out.println("Both are not equal ");
        }
    }

}
