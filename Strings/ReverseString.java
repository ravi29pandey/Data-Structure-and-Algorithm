package com.DSA.Strings;

import java.io.*;
import java.util.*;

// Class of ReverseString
class ReverseString {
	public static void main(String[] args)
	{
		String word = "Geeks For Geeks";
		char[] temp = word.toCharArray();
		int left, right = 0;
		right = word.length() - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp1 = temp[left];
			temp[left] = temp[right];
			temp[right] = temp1;
		}
        
		
		
		for (char c : temp)
			System.out.print(c);
		System.out.println();
	}
}
