package com.smglobal.Logic;

public class PrimeOrNotCheckNumber {

    /*
    0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
     */
    public static void main(String[] args){
        findPrimeNumberOrNot();
    }


    public static void findPrimeNumberOrNot()
    {
        int m=0, flag =0;

        int n=115;
        m = n/2;

        System.out.println(m);
        if(n==0 || n==1){
            System.out.println(n+"is not prime number");
        }else
        {
            for (int i=2; i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                System.out.println(n + " is prime number");
            }
        }

    }
}
