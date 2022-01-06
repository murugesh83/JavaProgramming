package com.smglobal.TypeConvert;

public class ConvertType {

    public static void main(String[] arghs){

        System.out.println("Value : ");
        String s ="100";

        //convert String to Integer

        int value = Integer.parseInt(s);
        System.out.println(value);

        s ="200";
        try {
            int value1 = Integer.valueOf(s);
            System.out.println(value1);
        }catch (NumberFormatException e){
            System.out.println("Unable to convert : "+e);
        }



    }
}
