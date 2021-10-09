package com.DSA.Strings;

public class IsPalindromeString {

	
	public boolean isPallindrome(String word) {
		
		char[] charArray=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				return false;
			}
			start++;
			end --;
			}
		return true;
		}
	
	
	


	public static void main(String[]args) {
	IsPalindromeString obj=new IsPalindromeString();
	boolean ab=obj.isPallindrome("nitin");
	if(ab==false) {
		System.out.println("Is Palindrome  "+ab);}
		else {
			System.out.println("Is Palindrome "+ ab);}
	}
	
		
		
	}

