package com.smglobal.strings;

import java.util.Locale;

public class CountVowelConsonant {
    public static void main(String[] args){

        int vowels =0, consonanet =0;

        String str ="This is a really simple sentence";

         String lowerCaseString = str.toLowerCase();

         for (int k=0;k<lowerCaseString.length(); k++)
         {
             if(lowerCaseString.charAt(k) != ' '){
                 if(lowerCaseString.charAt(k)=='a' || lowerCaseString.charAt(k)=='e' ||
                         lowerCaseString.charAt(k)=='i' ||
                         lowerCaseString.charAt(k)=='o' ||
                         lowerCaseString.charAt(k)=='u')
                 {
                     vowels++;
                 }else
                 {
                     consonanet++;
                 }

             }
         }

        System.out.println("Total vowels in the String : "+vowels);
        System.out.println("Total consonanet in the String : "+consonanet);

    }
}
