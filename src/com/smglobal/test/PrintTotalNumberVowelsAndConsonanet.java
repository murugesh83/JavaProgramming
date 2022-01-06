package com.smglobal.test;

public class PrintTotalNumberVowelsAndConsonanet {

    public static void main(String[] args){
        String str ="this is a really simple sentence".toLowerCase();

        int countVowel = 0;
        int countConsonanet= 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'||
            str.charAt(i)=='e'||
            str.charAt(i)=='i'||
            str.charAt(i)=='o'||
            str.charAt(i)=='u'){
                countVowel++;
            }else
            {
                countConsonanet++;
            }
        }

        System.out.println("Total number of vowels :"+countVowel);
        System.out.println("Total number of consonanent :"+countConsonanet);
    }
}
