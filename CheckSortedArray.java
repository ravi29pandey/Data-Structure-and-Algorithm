package com.DSA;

public class CheckSortedArray {

    static boolean checkSortedArray(int arr[]) {
        for (int i = 1; i < arr.length;i++){
            if(arr[i]>arr[i-1]){

            }
            else {return false;}
        }
return true;
    }
    public static void main(String[] args) {
        int arr[] ={1,3,5,4,8,90};
  System.out.print(checkSortedArray(arr));
    }
}
