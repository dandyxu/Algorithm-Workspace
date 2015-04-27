package com.Jan13;

import java.util.Random;
import java.util.Scanner;

public class Guessnumber {
	public static void main(String[] args) {
		System.out.println("Let's start a guess number game");
		System.out.println("A represented that the digits and position are all right");
		System.out.println("B represented that the digits are right, but the position is wrong");
		System.out.println("Plz enter a 4-digit number to start:");
		
		int A = 0, B = 0;
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		Random rand = new Random();
		int Original = rand.nextInt(9999) + 1000;
		//nextInt(max)%(max-min+1) + min
		System.out.println(Original);
		
		int[] a = new int[100];
		boolean iOriginal = false;
		
		while (number!= 0) {
			//check n & original
			while (!check(number)) {
				System.out.println("Input is incorrect, plz input again: ");
				number = scanner.nextInt();
			}
		
			while (!iOriginal) {
				if (check(Original)) 
					iOriginal = true;
				else
					Original = scanner.nextInt();
			}
		
			extracNumber(a, Original);
			hint(a, number,Original);
		
			if (A == 4) {
				System.out.println("Original number is " + Original);
				System.out.println("Congratulations!");
				System.exit(-1);
			}
			
			number = scanner.nextInt();
			A = 0;
			B = 0;
		}
	}
	
	public static boolean check(int n){
		if (n / 100 == 0 || n / 10000 != 0)
			return false;
		int[] temp = new int[n];
		int base = 1;
		int module = 10;
		for (int i = 0; i < 4; i++) {
			temp[i] = (n % module) / base;
			base *= 10;
			module *=10;
		}
		int sum = 0;
		for (int i = 0; i < 4; i++)
			for (int j = i + 1; j < 4; j++)
				if (temp[i] != temp[j]) 
					sum ++;
		if (sum != 6) 
			return false;
		else
			return true;
	}
		
	
	
	public static void extracNumber(int[] a, int Original){
//			int ge = number % 10;
//			int shi = number % 100 /10;
//			int bai = number % 1000 / 100;
//			int qian = number % 10000 / 1000;
			
			int base = 1;
			int module = 10;
			int i = 0;
			for (i = 0; i < 4; i++) {
				a[i] = Original % module / base;
				module *= 10;
				base *= 10;
			}
	}
	
	public static void hint(int[] a,int number,int Original){
		int A = 0; int B = 0;
		int base = 1;
		int module = 10;
		for (int i = 3; i >= 0; i--) {
			int temp = (number % module) / base;
			module *= 10;
			base *= 10;
			if (temp == a[3-i])
				A++;
			for (int j = 3; j >= 0; j--)
				if (temp == a[j] && temp != a[3-i])
					B++;
		}
		System.out.println(A + "A" + B + "B");
	}
	
}
