package com.Jan8;

import java.util.Scanner;

public class Traversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) 
			a[i] = sc.nextInt();
		
		//pre_order(a, 0, n);
		//in_order(a, 0, n);
		post_order(a, 0, n);
		
	}
	
	public static void pre_order(int[] a, int root,int size){
		if (root < size)                       //can be omitted, because if root is larger than size, the tree will not generated
			System.out.print(a[root] + " ");
		if (2 * root + 1 < size) 
			pre_order(a, 2 * root + 1, size);
		if (2 * root + 2 < size)
			pre_order(a, 2 * root + 2, size);
	}
	
	public static void in_order(int[] a,int root,int size){
		if (2 * root + 1 < size)
			in_order(a, 2 * root + 1, size);
		if (root < size) 
			System.out.print(a[root] + " ");
		if (2 * root + 2 < size)
			in_order(a, 2 * root + 2, size);
	}
	
	public static void post_order(int[] a,int root, int size){
		if (2 * root + 1 < size)
			post_order(a, 2 * root + 1, size);
		if (2 * root + 2 < size) 
			post_order(a, 2 * root + 2, size);
		if (root < size) 
			System.out.print(a[root] + " ");
	}
}
