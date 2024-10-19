package com.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArray2SumUsingHashMap {

    static int [] subArray2Sum(int[] arr,int target ){
       int result[]=new int[2];
        Map map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i],i);
            }else {
                result[1]=i;
                result[0]= (int) map.get(target-arr[i]);
                return result;
            }
        }

        throw new IllegalArgumentException("Two numbers are not found");
    }
    public static void main(String[] args) {
        int arr[]={2,11,5,10,7,8};
        int results[]=subArray2Sum(arr,9);
        System.out.print("Two indices are " + results[0] +" & " + results[1]);
    }
}
