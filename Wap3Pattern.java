package com.ineuronassignments;

public class Wap3Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= (n / 2) + i - 1 || j <= (n / 2) - i - 1 || j == 0 || j == n - 1 || i == n - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
				if (j == n - 1) {
					System.out.println();
				}
			}

		}

	}

}
