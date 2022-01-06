package com.smglobal.algorithm.search;

import java.util.Arrays;

//*
// Key Differences Between Linear Search and Binary Search
//Linear search is iterative in nature and uses sequential approach. On the other hand, Binary search implements divide and conquer approach.
//The time complexity of linear search is O(N) while binary search has O(log2N).
//The best case time in linear search is for the first element i.e., O(1). As against, in
// binary search, it is for the middle element, i.e., O(1).
//In the linear search, worst case for searching an element is
// N number of comparison. In contrast, it is log2N number of comparison for binary search.
//Linear search can be implemented in an array as well as in linked list
// whereas binary search can not be implemented directly on linked list.
//As we know Binary search requires the sorted array that is
// reason It requires processing to insert at its proper place to maintain
// a sorted list. On the contrary linear search does not require sorted elements,
// so elements are easily inserted at the end of the list.
//Linear search is easy to use, and there is no need for any ordered elements.
// \On the other hand, Binary search algorithm is however tricky, and elements are necessarily arranged in order.*/
public class BinaraySearch {

    public static void main(String[] args){

        int[] arr = new int[]{22, 33, 45, 1, 3, 99, 44};

        int item = 101;

        int first = 0;
        int last = arr.length -1;

        int mid =  (first + last)/2;

        System.out.println(mid);

        int retriveValue = Arrays.binarySearch(arr, item);

        System.out.println(retriveValue);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while (first <= last){
            if(arr[mid] < item){
               first = mid +1;
            }else
             if(arr[mid]==item){
               System.out.println("The item found");
               break;
             }
             else {
                 last = mid - 1;
             }
             mid = (last + first)/2;
        }

        if(first > last){
            System.out.println("Element not found");
        }

    }
}
