package com.smglobal.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArray {

    public static void main(String[] args){
        removeArrayfromAnotherArray();
    }


    public static void removeArrayfromAnotherArray()
    {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");


        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");

        System.out.println("Array elements of array1" +objArray);
        System.out.println("Array elements of array2" +objArray2);
        objArray.remove(objArray2);
        System.out.println("Array elements of array2" +objArray);
    }
}
