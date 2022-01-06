package com.smglobal.test;

public class PrintTheDuplicateCharactorInSentance {

    public static void main(String[] args){

        String string1 = "Great responsibility";

       PrintTheDuplicateCharactorInSentance printTheDuplicateCharactorInSentance=new PrintTheDuplicateCharactorInSentance();
       int count = printTheDuplicateCharactorInSentance.findGiveCharOccurence(string1, 'e');
        System.out.println("Given Char count in sentances : e "+count);

    }

    public  int findGiveCharOccurence(String str, char c){

        int count = 0;

        for(int i=0; i<str.length(); i++){
            char checkChar = str.charAt(i);
            if(checkChar == c){
                count++;
            }
        }

        return count;
    }
}
