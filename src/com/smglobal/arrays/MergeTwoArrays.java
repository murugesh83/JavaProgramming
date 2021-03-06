package com.smglobal.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {

    public static void main(String[] args){
        String a[] = { "A", "E", "I"};
        String b[] = {"O", "U"};

        List list= new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));

        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

        mergeTwoArrays();
    }


    public static void mergeTwoArrays(){
        int[]a = {1,2,3,4};
        int[]b = {4,16,1,2,3,22};
        int[]c =new int[a.length+b.length];

        int count = 0;
        for(int i=0; i<a.length; i++){
            c[i]= a[i];
            count++;
        }

        for (int j=0; j<b.length; j++){
            c[count++] = b[j];
        }

        for (int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
}
