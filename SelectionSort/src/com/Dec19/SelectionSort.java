package com.Dec19;

import java.util.Scanner;

/**
 * The algorithm proceeds by finding the smallest (or largest, depending on
 * sorting order) element in the unsorted sublist, exchanging it with the
 * leftmost unsorted element (putting it in sorted order), and moving the
 * sublist boundaries one element to the right
 * 
 * @author Dandy
 * 
 */
public class SelectionSort {
	public static void selectionSort(int[] a) {

		// set up a cursor
		int min;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		selectionSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}

	}

}
