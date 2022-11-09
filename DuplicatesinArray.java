package com.ineuronassignments;

public class DuplicatesinArray {

	public static void main(String[] args) {
		boolean blnDuplicateExists = false;
		int[] ar = { 10, 21, 11, 33, 41, 30, 33, 41, 22, 21 };
		System.out.println("Array is created with duplicate elements");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					blnDuplicateExists = true;
					System.out.println(ar[i]);
				}
			}
		}
		if (blnDuplicateExists)
			System.out.println("Duplicates were found");
		else
			System.out.println("Duplicates not found");

	}

}
