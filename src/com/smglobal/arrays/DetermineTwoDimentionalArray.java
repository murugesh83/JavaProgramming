package com.smglobal.arrays;

public class DetermineTwoDimentionalArray {

    public static void main(String[] args){
        twoDimentionalArrayDetermine();
    }

    public static void twoDimentionalArrayDetermine()
    {
        String[][]  data=new String[2][4];
        System.out.println("Dimension 1: "+data.length);
        System.out.println("Dimension 1: "+data[0].length);
    }
}
