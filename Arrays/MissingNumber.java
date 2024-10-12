package com.DSA.Arrays;

public class MissingNumber {

    static int MissingNumber(int arr[]) {

        int sum=0;
        int n=arr.length+1; // 8
        sum=(n*(n+1)/2); //36
            for(int num:arr) {
                sum = sum - num;
            }
            return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 6, 7, 8};
        System.out.println("Missing num is " + MissingNumber(arr));

    }
    }
