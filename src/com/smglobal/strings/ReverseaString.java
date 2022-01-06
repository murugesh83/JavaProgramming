package com.smglobal.strings;

public class ReverseaString {

    public static void main(String[] args){
        String string = "Dream big";

        char[] chars= string.toCharArray();
        String str= "";

        for (int i=chars.length-1; i>=0; i--){
           // if(chars[i]!=' ')
            str = str + chars[i];
        }
        System.out.println("Reversed String : "+str);

        str ="";
        for (int i=chars.length-1; i>=0; i--){
            // if(chars[i]!=' ')
            str = str + string.charAt(i);
        }

        System.out.println("Reversed String : "+str);
    }
}
