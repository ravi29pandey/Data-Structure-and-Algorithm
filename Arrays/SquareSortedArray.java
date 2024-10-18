package com.DSA.Arrays;

import java.util.Arrays;

public class SquareSortedArray {
    //2 pointer approach
   static int[] sortedSquares(int arr[]){
        int n=arr.length;
        int i=0,j=n-1;
        int [] results=new int[n];

        for(int k=n-1;k>=0;k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                results[k]=arr[i] * arr[i];
                    i++;
            }else {
                results[k] = arr[j] * arr[j];
                j--;
            }
        }

        return results;


    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
       System.out.print("Sorted Squrare - "+ Arrays.toString(sortedSquares(arr)));

    }
}
