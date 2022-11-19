package com.stringoperations.all;

public class PrintDupliFromString {

	public static void main(String[] args) {
		String str = "bamboobeetle";
		char[] ch = str.toCharArray();
		System.out.println("Original String is::" + " " + str);
		System.out.println();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print( ch[j] + " ");
					break;
									
				}
			}
		}
	}

}
