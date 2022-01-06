package com.smglobal.matrix;

public class FindODDANDEVENNumber {

    public static void main(String[] args){
        int oddNumber=0, evenNumber=0;
        int[][]  a ={{4,1,3}, {3,5,7},{8,2,6}};


        int row = a.length;
        int col = a[0].length;
        System.out.println(row +"   "+col);

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){

                if(a[i][j]%2==0){

                    evenNumber++;
                }else
                {
                    oddNumber++;
                }

            }

        }
        System.out.println("Odd Number : "+oddNumber);
        System.out.println("even Number : "+evenNumber);
    }
}
