package com.Jan9;

import java.util.Scanner;

public class InsertSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) 
			a[i] = sc.nextInt();
		
		Insert_sort(a,n);
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
	
	public static void Insert_sort(int[] a, int n){
		int i,j,key;
		for (i = 1; i < n; i++){
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

}
