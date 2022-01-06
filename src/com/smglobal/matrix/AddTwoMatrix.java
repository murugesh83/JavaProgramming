package com.smglobal.matrix;

class AddTwoMatrix {

    public static void main(String[] args){

        int[][]  matrix1={{1,3,4}, {2,4,3}, {3,4,5}};
        int[][]  matrix2={{1,3,4}, {2,4,3}, {1,2,4}};
        System.out.println(matrix1.length);
        System.out.println(matrix1.length);

        int c[][] =new int[matrix1.length][matrix2.length];

        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j< matrix2.length; j++){
                c[i][j] = matrix1[i][j]+matrix2[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}