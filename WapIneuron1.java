package com.ineuronassignments;

public class WapIneuron1 {

	public static void main(String[] args) {
		int n = 9;

		for (int i = 0; i < n; i++) {
			/* for letter S */
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n / 2 || i == n - 1 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}
			// Letter I
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}

			// Letter R
			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i == 0 && j != n - 1) || (i == n / 2 && j <= n / 2 + 2)
						|| (i < n / 2 && j == n - 1 && i != 0 && j != n / 2) || (i >= n / 2 && j == i - (n / 2) + 4))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}
			// Letter I
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			// Letter I
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// Two spaces
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}

			// Letter N
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}

			// Letter E
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n - 1 || i == 0 || i == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}

			// Letter U
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1) || (j == n - 1 && i != n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}

			// Letter R
			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i == 0 && j != n - 1) || (i == n / 2 && j <= n / 2 + 2)
						|| (i < n / 2 && j == n - 1 && i != 0 && j != n / 2) || (i >= n / 2 && j == i - (n / 2) + 4))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}

			// Letter O
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i != 0 && i != n - 1) || (i == 0 && j != 0 & j != n - 1)
						|| (i == n - 1 && j != 0 & j != n - 1) || (j == n - 1 && i != 0 & i != n - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// Space
			for (int j = 0; j < n / 2; j++) {
				System.out.print(" ");
			}

			// Letter N
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
