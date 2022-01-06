package com.smglobal.test;

public class RemoveSpecificCharactor {

    public static void main(String[] args){

        String str ="Hello how are you?";
        int pos = 1;


        char[] strCharArr = str.toCharArray();

        if(strCharArr.length > pos) {

            String word = str.substring(0, pos) +str.substring(pos);

            System.out.println(word);
            System.out.println(str.substring(0, pos));
            System.out.println(str.substring(pos));

        }

    }
}
