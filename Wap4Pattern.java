package com.ineuronassignments;

public class Wap4Pattern {

	public static void main(String[] args) {
		int n = 15;
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < n; j++)

				if (j <= i || (j >= n - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			System.out.println();
		}

	}

}
