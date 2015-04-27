package com.Jan7;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		perm(a, 0, n);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void perm(int[] a, int i, int n) {
		if (i == n) {
			for (int j = 0; j < n; j++)
				System.out.print(a[j] + " ");
			System.out.println();
		} else {
			for (int j = i; j < n; j++) {
				swap(a, i, j);
				perm(a, i + 1, n);
				swap(a, i, j);
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
