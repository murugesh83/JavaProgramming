package com.smglobal.SearchingandSorting;

import java.util.Scanner;

public class LinearSearch {

    public  static void main(String[] args){
        int n, search;
        int arr[];

        System.out.println("Enter number of element ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        arr= new int[n];
        System.out.println("Enter Arrat element ");
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter number the Search Number  ");
        search = scanner.nextInt();

        for (int i=0; i<arr.length; i++){
            if(arr[i]== search){
                System.out.println("Found the number in the Array list");
                break;
            }
        }

    }
}
