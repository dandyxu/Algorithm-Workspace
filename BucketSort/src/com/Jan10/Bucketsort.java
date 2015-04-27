package com.Jan10;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Bucketsort {

	
	public static void main(String[] args) {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(in.readLine());
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++ )
			a[i] = scanner.nextInt();
		
		Bucket_sort(a,n);
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static void Bucket_sort(int[] array,int max){
		int[] sorted = new int[max + 1];
		for (int i = 0; i < array.length; i++)
			sorted[array[i]] = array[i];
	}
	

	
	
}
