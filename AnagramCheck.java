package com.stringoperations.all;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1= "Newyork Times";
		String s2="monkeys write";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
				
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("String s1 and String ss2 are Anagrams");
			
		}
		else
		{
			System.out.println("String s1 and String s2 are not Anagrams");
		}
	}

}
