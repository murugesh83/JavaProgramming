package com.smglobal.strings;

public class duplicatewordInString {
    public static void main(String[] args){
        String string = "Big black bug bit a big black dog on his big black nose";
        int count=0;

        String[] strArr= string.split(" ");

        for (String str : strArr) {
           // System.out.println(str);

        }
        //System.out.println(strArr.length);

        for(int i=0; i<strArr.length; i++){
            count= 0;
            for (int j=i+1; j<strArr.length; j++){
               // System.out.println("*****"+strArr[i] +"   "+strArr[j]);
                if(strArr[i]==strArr[j] || strArr[i].equalsIgnoreCase(strArr[j])){
                    count++;
                    //System.out.println("*****");
                }
            }

            if(count>0)
            System.out.println("Duplicate words in String : "+strArr[i]);
        }

    }
}
