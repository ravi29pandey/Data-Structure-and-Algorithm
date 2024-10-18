package com.DSA.Arrays;

public class KadanesAlgo {

    static int MaximumSubArray(int arr[]){
        int currentMax=arr[0];
        int MaxSoFar=arr[0];

        for(int i=1;i<arr.length;i++){
            currentMax=currentMax+arr[i];
            if(currentMax<arr[i]){
                currentMax=arr[i];
            }
            if(MaxSoFar<currentMax){
                MaxSoFar=currentMax;
            }

        }
        return MaxSoFar;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        System.out.print(MaximumSubArray(arr));
    }
}
