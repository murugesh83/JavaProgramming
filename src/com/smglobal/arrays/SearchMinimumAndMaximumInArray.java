package com.smglobal.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SearchMinimumAndMaximumInArray {

    public static void main(String[] args){
       //findMinAndMaxValue();
        findMinAndMaxValues();
    }

    public static void findMinAndMaxValue()
    {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));
        System.out.println("Min Number : "+min);
        System.out.println("Max Number : "+max);
    }

    public static void  findMinAndMaxValues(){
        Integer[] integers={ 8, 2, 7, 1, 4, 9, 5};

        int min =integers[0];
        int max =integers[0];

        System.out.println("Min Number : "+min);
        System.out.println("Max Number : "+max);
        for(int i=0; i<integers.length; i++){

            if(integers[i] > max){
                max = integers[i];
            }else if(integers[i] < min)
            {
                min = integers[i];
            }
        }

        System.out.println("Min Number : "+min);
        System.out.println("Max Number : "+max);




    }
}
