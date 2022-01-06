package com.smglobal.strings;

import java.util.Locale;

public class SplitString {

    public static void main(String[] args) {
        String str = "I am good, How are you";
        String delimeter = "\\s";
        String[] stringArrays = str.split(delimeter);
        for (int i = 0; i < stringArrays.length; i++) {
            System.out.println(stringArrays[i]);
        }

        System.out.println();
        String strdot = "I.am.good.How.are.you";
        delimeter = "\\.";
        String[] stringArrays1 = strdot.split(delimeter);

        for (int i = 0; i < stringArrays1.length; i++) {
            System.out.println(stringArrays1[i]);
        }

        System.out.println();
        String strHipan = "I-am-good-How-are-you";
        delimeter = "-";
        String[] stringArrays2 = strHipan.split(delimeter);

        for (int i = 0; i < stringArrays2.length; i++) {
            System.out.println(stringArrays2[i]);
        }

        System.out.println();
        String strComma = "I,am,good,How,are,you";
        delimeter = ",";
        String[] stringArrays3 = strComma.split(delimeter);

        for (int i = 0; i < stringArrays3.length; i++) {
            System.out.println(stringArrays3[i]);
        }
        System.out.println();
        String s1 = "t u t o r i a l s";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
        System.out.println();
        convertUpperLowerCase();

    }

    public static void convertUpperLowerCase() {
        String str = "String abc touppercase ";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }



}
