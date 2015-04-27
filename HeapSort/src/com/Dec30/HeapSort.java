package com.Dec30;

import java.util.Scanner;
import java.util.Set;

/**
 * HeapSort
 * 
 * @author Dandy 
 * Test Case 
10 
72 6 57 88 60 41 83 73 48 85
 */

public class HeapSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) 
			a[i] = sc.nextInt();
		
		//Build Heap
		buildHeap(a);
		//SetDown
		SetDown(a, 0, n);
		//Heapsort
		Heapsort(a);
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
	}

	public static void buildHeap(int[] a){
		/**
		 * To build heap structure from Parent node (array length /2 -1) to 0
		 * Then Set down the number in the heap
		 */
		for (int i = a.length / 2 -1; i >=0 ; i--) {
			SetDown(a, i, a.length);
		}
	}
	
	public static void SetDown(int[] a, int index, int size){
		/**
		 * To Set down the largest number to the top
		 */
		int maxPosition;
		while (2 * index + 1 < size) {
			maxPosition = 2 * index + 1;	//presume index of Left node as maxPosition index
			if (2 * index + 2 < size && a[2 * index + 2] > a[maxPosition])  //a[maxPosition] was a[LeftNode],if a[LeftNode] < a[RightNode],  
				maxPosition = 2 * index + 2;                                //Set index of Right Node as maxPosition
			if (a[index] < a[maxPosition]) {								//Compare Parent Node with maxPosition(in Left and Right Node)
				Swap(a,index,maxPosition);									
				index = maxPosition;										//Set maxPosition as index
			}else {															//if a[index] >= a[maxPosition], fit the requirement of Heap(Large),then break
				break;
			}
		}
	}
	
	public static void Swap(int[] a, int i, int  j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void Heapsort(int[] a){
		
		int size = a.length;												//Set int size to record the length of array
		for (int i = size - 1; i >= 0; i--) {								//From size - 1 to 0, i--, each loop will swap a[0] and a[i]
			Swap(a, 0, i); 													//Then size--, simulating the action of deleting a[i], shrinking tree
			size--;															//SetDown to adjust the heap from a[0] to a[size]
			SetDown(a, 0, size);											//PS size will iteratively reduce as tree is shrinking 
		}
		
		
	}
}
