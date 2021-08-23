package com.DSA.Arrays;

public class SelectionSort {
	
	public void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println( );
	}
	
	
	public void sort(int arr[]) {
		
		int n=arr.length;
		for (int i=0;i<n-1;i++)
		{
			int min=i;
			for (int j=i+1;j<n;j++) {//Loop to traverse until it finds the minimum value 
				if(arr[j]<arr[min])
				min=j;
				
			}
			int temp=arr[min];  /*Swap if the element to the i=min element to put it in sorting array*/
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
	}

	public static void main(String[] args) {
		int arr[]=new int[]{55,8,7,91,1};
		SelectionSort sort=new SelectionSort();
         sort.printArray(arr);
         sort.sort(arr);
         sort.printArray(arr);
	}

}
