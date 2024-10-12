package com.DSA.Arrays;

public class MinMaxArray {

    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is " + min);

    }

    static void max(int arr[]){
        int max=arr[0];

        for(int i=1;i<=arr.length-1;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Maximum value is "+ max);

    }
    public static void main(String[]args){
    int arr[]={1000,897,458,595,87};
    min(arr);
    max(arr);


}


}
