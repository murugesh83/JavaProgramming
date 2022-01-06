package com.smglobal.test;

public class ReveseNumberTest {

    public static void main(String[] args){

        int number = 123456789;
        System.out.println("Given Number : "+number);
        String num = String.valueOf(number);
        String reversed = "";

        for(int i=num.length()-1; i>-1; i--){
            reversed = reversed + num.charAt(i);
        }

        System.out.println("Revesed Number : "+Integer.valueOf(reversed));
    }


    private void reveseNubmer(){


    }
}
