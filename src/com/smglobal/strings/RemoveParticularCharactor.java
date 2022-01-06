package com.smglobal.strings;

public class RemoveParticularCharactor {

    public static void main(String[] args){

        String str ="Hello how are you?";
        System.out.println("Removed Char : "+removeCharAt(str, 17));

        stringReplaceEmp();
    }

    public static String removeCharAt(String s, int pos){

        char[]  charArray= s.toCharArray();
        for (int i= 0; i<charArray.length; i++){
            System.out.println(i+" "+charArray[i]);
        }

        System.out.println("The length of the Strinng is : "+s.length());
        if(s.length() > pos)
        return s.substring(0, pos) + s.substring(pos+1);
        else
            return "Index out of bound Exception";
    }

    public static void stringReplaceEmp(){

        String str= "Hello World";
        System.out.println(str.replace("H", "h"));
        System.out.println(str.replace("W", "w"));
        System.out.println(str.replace("r", ""));
    }


}

