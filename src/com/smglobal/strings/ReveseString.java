package com.smglobal.strings;

import java.util.HashMap;

public class ReveseString {


    public static void main(String[] args){


        //Find most occured Character


    }


    private static void findWordChar1()
    {
        String str = "Find most occured Characcccct2eeer";
        HashMap<Character, Integer> integerHashMap=new HashMap<>();
        for (int i=0; i<str.length()-1; i++){
            char key = str.charAt(i);
            if(key != ' ') {
                //System.out.println(key);
                int value = 1;
                boolean flag = integerHashMap.containsKey(key);
                if (flag == true) {
                    value = integerHashMap.get(key) + 1;
                }
                integerHashMap.put(key, value);
            }
        }
        int max =0;
        int min =1;
        char mKey= ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char key : integerHashMap.keySet()) {
            int value = integerHashMap.get(key);
            if(value > max){
                max =value;
                mKey = key;
                hashMap.put(mKey, max);
            }
        }

        System.out.println(mKey  +"  "+"  "+max +"     "+min);
        System.out.println(integerHashMap);

    }

private static void  findWordChar()
{
    String str = "Count words words";
    char   c = 'w';

    HashMap<Character, Integer> myMap =new HashMap<>();

    for (int i=0; i<=str.length()-1; i++){
        //System.out.print(str.charAt(i)+" ");
        char key = str.charAt(i);
        if(key == c) {
            int value = 1;
            boolean flag = myMap.containsKey(key);
            if (flag == true) {
                value = myMap.get(key) + 1;
            }
            myMap.put(key, value);
        }
    }

    System.out.println(myMap);
}
    private static void findWordOccurence()
    {
        String str = "Count words words";

        String[] strArr= str.split(" ");
        HashMap<String, Integer> mapWordCount = new HashMap<>();
        for(int i=0 ;i<=strArr.length-1; i++)
        {
            int value = 1;
            String word = strArr[i];
            boolean flag= mapWordCount.containsKey(word);
            if(flag == true){
                value = mapWordCount.get(word)+1;
            }
            mapWordCount.put(word, value);
        }
        /*for (String a :strArr) {
            int value =1;
            boolean flag = mapWordCount.containsKey(a);
            if(flag == true) {
                value = mapWordCount.get(a)+1;
            }
            mapWordCount.put(a, value);
        }
*/
        System.out.print(mapWordCount);

    }
    private static void forLoop()
    {
        String str = "CountCtttttt  How are you";

        for (int i=0; i< str.length()-1; i++){
            System.out.print(str.charAt(i)+"   ");
        }

        System.out.println();
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+"");
        }
    }

    private static void countCharacter(){
        //count Character

        String str = "CountCtttttt  How are you";
        HashMap<Character, Integer> mymap =new HashMap<>();
        for(int i=0; i<=str.length()-1; i++){
            int value = 1;
            char a = str.charAt(i);
            //System.out.println(str);
            if(a != ' ') {
                boolean flag = mymap.containsKey(a);
                System.out.println(flag);
                if (mymap != null) {
                    if (flag == true) {
                        value = mymap.get(a) + 1;
                    }
                    mymap.put(a, value);
                }
            }
        }
        System.out.println(mymap);
    }
    private static void reveseString()
    {
        String  str = "Bank";

        StringBuilder stringBuilder=new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            if(str == "")
                return;
            char a = str.charAt(i);
            stringBuilder.append(a);
            str.substring(i);
        }

        System.out.println(stringBuilder);
    }
}

