package com.smglobal.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementInArrays {

    public static void main(String[] args){

        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,1);
        objArray2.add(1,1);
        objArray2.add(2,2);
        objArray2.add(3,3);
        objArray2.add(3,4);

        objArray.add(0,1);
        objArray.add(1,2);
        objArray.add(2,1);
        objArray.add(2,4);
        objArray.add(2,6);


        System.out.println("Array elements of array1"+objArray2);
        System.out.println("Array elements of array2"+objArray);

       objArray.retainAll(objArray2);

        System.out.println("Array elements of array2"+objArray);

        int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};

        int[] arr3= new int[arr2.length];
        int k =0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j< arr1.length; j++){
                try {
                    if(arr1[i] == arr2[j]){
                        arr3[k]= arr1[i];
                        k++;
                    }
                }catch (IndexOutOfBoundsException e){

                }

            }
        }

        System.out.print(Arrays.toString(arr3));
    }


}
