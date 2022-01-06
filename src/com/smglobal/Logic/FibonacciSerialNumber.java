package com.smglobal.Logic;

public class FibonacciSerialNumber {

    //0, 1, 1, 2, 3, 5, 8, 13, 21,.....
    public static void main(String[] args)
    {

   printFibonacciNumber(0, 1, 10);
    }


    public static void printFibonacciNumber(int frist, int second, int num){

        int previousNum =0;
        int temp = 0;
        if (frist == num) {
            System.out.println(frist);
            return;
        }else
        if(second == num){
            System.out.println(frist);
            return;
        }else{
            for(int i=0; i<num; i++){
                System.out.println("****"+frist+"      *****"+second);
                temp = frist + second;
                System.out.println(temp);
                frist = second;
                second = temp;
            }
        }

        /*
        *  0  ->   0 + 0  -->  0
        *  1  ->   0 + 1  -->  1
        *  2  ->   1 + 1  -->  2
        *  3 ->    1 + 2  -->  3
        *  4 ->    2 + 3  --> 5
        *
        *
        *
        * */


    }
}
