package com.Dec19;

import java.util.Scanner;

/**
 * QuickSort
 * 
 * @author Dandy 
 * Test case 
10 
72 6 57 88 60 41 83 73 48 85
 */

public class QuickSort {
//	public static void quicksort(int[] a, int l, int r) {
//		int i = l;
//		int j = r;
//		while (i < j) {
//			int pivot = a[i];
//			while (i < j && a[j] >= pivot)
//				j--;
//			a[i] = a[j];
//			while (i < j && a[i] <= pivot)
//				i++;
//			a[j] = a[i];
//		
//			a[i] = pivot;
//			quicksort(a, l, i - 1);
//			quicksort(a, i + 1, r);
//		}
//	}
	
	public static void quicksort(int[] a,int l,int r){
		if (l < r) {
			int i = l;
			int j = r;
			int pivot = a[i];
			while (i < j) {
				
				while (i < j && a[j] >= pivot)
					j--;
				a[i] = a[j];
				while (i < j && a[i] <= pivot)
					i++;
				a[j] = a[i];
			}
				a[i] = pivot;
				quicksort(a, l, i - 1);
				quicksort(a, i + 1, r);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		// System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		quicksort(a, 0, n - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
