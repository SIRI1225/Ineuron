package com.ineuronassignments;

public class Wap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || (i == n / 2 && j == 0) || (i < n / 2 && j <= n / 2 - i)
						|| (i >= n / 2 + 1 && j <= i - n / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
