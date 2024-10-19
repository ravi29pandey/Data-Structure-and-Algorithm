package com.DSA.Arrays;


import java.util.Arrays;

public class SubArray2SumUsingSlidingWindow {

        static int [] subArray2Sum(int[] arr,int target ){
            Arrays.sort(arr);
            int left=0;
            int right = arr.length-1;
            int result[]=new int[2];
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==target){
                  result[0]=arr[left];
                  result[1]=arr[right];
                  return result;
                }
                else if(sum<target){
                    left ++;
                }
                else {
                    right--;
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


