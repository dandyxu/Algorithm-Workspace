package com.Jan2;

import java.util.Scanner;

/**
 * Merge sort
 * 
 * @author Dandy Test case 10 9 4 7 1 3 8 6 5 2 10
 * 
 */

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		merge_sort(a, 0, n);
		// bottomUp_merge(a);

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void merge(int[] array, int first, int mid, int last) {
		int i = first, j = mid;
		int k = 0;
		int[] unsorted = new int[array.length];
		while (i < mid && j < last)
			if (array[i] < array[j])
				unsorted[k++] = array[i++];
			else
				unsorted[k++] = array[j++];
		while (i < mid)
			unsorted[k++] = array[i++];
		while (j < last)
			unsorted[k++] = array[j++];
		k = 0;
		for (int v = first; v < last; v++)
			array[v] = unsorted[k++];
	}

	public static void merge_sort(int[] array, int first, int last) {
		// recursion
		if (first + 1 < last) {
			int mid = (first + last) / 2;
			merge_sort(array, first, mid);
			merge_sort(array, mid, last);
			merge(array, first, mid, last);
		}
	}

	public static void bottomUp_merge(int[] array) {
		int length = 1;
		int i;
		while (length < array.length) {
			for (i = 0; i + 2 * length < array.length; i += 2 * length) {
				merge(array, i, i + length, i + 2 * length);
			}
			if (i + length < array.length) {
				merge(array, i, i + length, array.length);
			}
			length *= 2;
		}
	}
}
