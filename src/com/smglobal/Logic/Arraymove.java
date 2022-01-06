package com.smglobal.Logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraymove {

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + ", " + arr[count]);
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count = count + 1;
            }

        }

        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("abc");
        stringArrayList.add("abc");
        stringArrayList.add("abc");


        LinkedList<String> list=new LinkedList<String>();
        list.add("hellow");
        list.addLast("hellow1");
        list.addLast("hellow2");
        list.remove("hellow");



        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    /*for (int value : arr)
       // System.out.print(value+", ");

    }*/

    }

}
