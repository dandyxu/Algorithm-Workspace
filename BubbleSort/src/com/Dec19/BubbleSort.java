package com.Dec19;

import java.util.Scanner;

/**
 * BubbleSort Compare each pair of adjacent elements from the beginning of an
 * array and, if they are in reversed order, swap them. If at least one swap has
 * been done, repeat step 1.
 * 
 * @author Dandy
 * 
 */

public class BubbleSort {
	public static void bubbleSort(int a[]) {

		// compare two variables and swap the smaller one
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		// input numbers passing to array a[];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		bubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}

	}

}
