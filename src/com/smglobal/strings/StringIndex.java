package com.smglobal.strings;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class StringIndex {


    public static void main(String[] args){
        stringLastIndex();
    }

    public static void stringLastIndex()
    {
        String str ="Hello World, Hi Hello world";
        char[] chars =str.toCharArray();

        final int val;
        val =34;

        for (int i=0; i< chars.length; i++){
            System.out.println(i+"  "+chars[i]);
        }

        int lastIndex = str.lastIndexOf("world");
        System.out.println(lastIndex);

        int lastIndexChar = str.lastIndexOf("o");
        System.out.println("last Index : "+lastIndexChar);

        int temp = 257%10; //get last digits
        int temp1 = 257/10; //remove last digits
        System.out.println(temp);
        System.out.println(temp1);

    }
}
