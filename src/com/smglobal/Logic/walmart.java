package com.smglobal.Logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class walmart {

    public static String solve(List<Integer> ar){
        //Write your code here


        int mid = ar.size()/2;

        int leftSum = 0;
        int rightSum = 0;

        for(int j=0; j<ar.size(); j++){
            if(j > mid){
                int r =   ar.get(j);
                rightSum = rightSum + r;
            }else
            {
                int l =   ar.get(j);
                leftSum = leftSum + l;
            }
        }
        System.out.println("left Sum is "+leftSum+",");
        System.out.println("right Sum is "+rightSum+",");


        if(leftSum == rightSum){
            return "YES";
        }else
        {
            return "NO";
        }

    }




    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr=new  ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(2);

        walmart outcome=new walmart();
       String result= outcome.solve(arr);
        System.out.println(result);

    }


}
