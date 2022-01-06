package com.smglobal.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args){
        //reverseArrayUsingCollectionObject();

        reverseArrayUsing();
    }


    public static void reverseArrayUsingCollectionObject()
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println("Before reverse order : "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("After reverse order : "+arrayList);

    }

    public static void reverseArrayUsing()
    {
        int[] numbers= {1,2,3,4,6,5, 8};
        for(int i=0; i<numbers.length; i++ ){
            System.out.println(numbers[i]);
        }

       // System.out.println( numbers.length / 2);
        /*for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }*/
        System.out.println("\nArray after reverse:");
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }*/

        for(int i= numbers.length-1; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
    }




}
