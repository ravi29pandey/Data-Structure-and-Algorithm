package com.DSA.Strings;

import java.util.Set;

public class RemoveVowelsFromString {

	
	
	public String removeVowels(String str) {
		Set<Character> vowels=Set.of('a','e','i','o','u');
		StringBuilder sb=new StringBuilder();
		
		char[] charArray=str.toCharArray();
		for(Character ch: charArray) {
			if(!vowels.contains(ch)) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
		
		
	}
	
	
	
	public static void main(String []args) {
		RemoveVowelsFromString remove=new RemoveVowelsFromString();
		System.out.println(remove.removeVowels("Hi  my name is Ravi"));
		
		
		System.out.println();
	}
	
}
