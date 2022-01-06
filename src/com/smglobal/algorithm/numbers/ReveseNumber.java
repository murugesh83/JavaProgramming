package com.smglobal.algorithm.numbers;

public class ReveseNumber {

    public static void main(String[] args){

        int number = 123456789;

        System.out.println(number%10);
        int reversenum = 0;
        String num = "";

        while (number != 0){
            num = num + number%10;
            System.out.println("% 10 "+ number%10);
            number = number/10;
            System.out.println("/ 10 "+ number/10);
        }
        reversenum = Integer.valueOf(num);
        System.out.println(reversenum);


    }
}
