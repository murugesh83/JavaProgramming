package com.smglobal.strings;

import java.net.CacheRequest;

public class StringReverseExample {

    public static void main(String[] args){
       // stringReverse();
        //strReverse();

        //searchStrimEmp();
        checkWordContains();
    }


    public static void stringReverse(){
        String string ="abcdef";
        String reverse =new StringBuffer(string).reverse().toString();

        System.out.println("\nString before reverse : "+string);
        System.out.println("\nString after reverse : "+reverse);
    }

    public static void strReverse()
    {
        String string ="abcdefgh";
        char[]  charArray= string.toCharArray();
        String reversed ="";

        if(string.length() > 0){
            for (int i=string.length()-1 ; i>0; i--){
                reversed =reversed+charArray[i];
            }
        }
        System.out.println("\nString before reverse : "+string);
        System.out.println("String after reverse : "+reversed);

    }

    public static void searchStrimEmp()
    {
        String strOrig = "hello readers";
        int intIndex= strOrig.indexOf("read");

        if(intIndex > -1){
            System.out.println("Found");
        }else
        {
            System.out.println("Not Found "+intIndex);
        }
    }

    public static void checkWordContains()
    {
        String strOrig = "hello readers";
        if(strOrig.contains("readers")){
            System.out.println("Found the word");
        }else
        {
            System.out.println("The word not found");
        }
    }
}
