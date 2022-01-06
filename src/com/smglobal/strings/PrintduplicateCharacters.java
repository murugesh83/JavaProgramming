package com.smglobal.strings;

public class PrintduplicateCharacters {

    public static void main(String[] args){

        String string1 = "Great responsibility";
        int count =0;

        char[] strChar = string1.toCharArray();

         for(int i=0; i<strChar.length; i++){
             count =0;
             if(strChar[i] != ' ') {
                 for (int j = i + 1; j < strChar.length; j++) {
                     if (strChar[i] == strChar[j]){
                         count++;
                     }
                 }
             }

             if(count>0)
             System.out.println("Duplicate charactore found : "+strChar[i]);
         }
    }
}
