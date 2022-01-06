package com.smglobal.test;

public class PrintDuplicateWordInSentance {

    public static void main(String[] args){

        String string = "Big black bug bit a big black dog on his big black nose";
        String[] strArr =null;
        if(!string.isEmpty()) {
            strArr = string.split(" ");
        }

        for(int i=0; i< strArr.length; i++){
            int count =0;
            for(int j=i+1; j<strArr.length; j++){
                if(strArr[i]==strArr[j] || strArr[i].equalsIgnoreCase(strArr[j])){
                    count++;
                }
            }

            if(count>0){
                System.out.println(strArr[i]);
            }
        }




    }
}
