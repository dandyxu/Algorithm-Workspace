package com.Jan14;

import java.util.Scanner;

public class Poj1245 {
	//Refered to Xingda in UL, Ireland
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) break;
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = scanner.nextInt();
			int tempS = 0;
			int tempE = 0;
			int s = 0;
			int e = n - 1;
			while (s != e) {
				if (tempS <= tempE)
					tempS += a[s++];
				else
					tempE += a[e--];
			}
			//tempS < tempE ? tempS +=a[s], s++ : tempE +=a[e];
			if (tempS < tempE) {
				tempS +=a[s];
				s++;
			}else {
				tempE +=a[e];
			}
			if (tempE != tempS) {		
				System.out.println("No equal partitioning.");
			}else {
				System.out.println("Sam stops at position " + s + " and Ella stops at position "+ (s+1) + ".");
			}
		}
	}
}
