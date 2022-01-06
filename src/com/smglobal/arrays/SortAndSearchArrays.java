package com.smglobal.arrays;

import java.util.Arrays;

public class SortAndSearchArrays {

    public static void main(String[] args){
        //sortAndSearchArray();
        //linearSearch();
        bubleSort();
    }


    public static void sortAndSearchArray(){
        int array[] ={-9,-6,-5,-4,3,54,4,33,1,0};

        Arrays.sort(array);

        for(int i=0; i<array.length; i++){
            if(i!=0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }

        System.out.println();
        int index = Arrays.binarySearch(array, 2);
        if(index !=-1){
            System.out.println("Found 54 @"+index);
        }else
        {
            System.out.println("Not found ");
        }
    }

    public static void linearSearch()
    {
        int array[] ={-9,-6,-5,-4,3,54,4,33,1,0};
        int target = -5;

        for(int i=0; i<array.length; i++){
            if(target == array[i]){
                System.out.println(array[i] +" @"+i);
            }
        }
    }

    public static void bubleSort()
    {
        int arr[] ={ 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

        System.out.println("Before bubble sort ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int length = arr.length;
        int temp = 0;

        for(int i=0; i<length; i++){
            for(int j=i+1; j<(length); j++){
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("After bubble sort ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
