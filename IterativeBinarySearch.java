package com.practice;

import java.util.Scanner;

public class IterativeBinarySearch {

	private static int binarySearch(int[] array, int key) {
		
		int l = 0, h = array.length;
		while(l<h)
		{
			int mid = l + (h-l) / 2;
			if(array[mid] == key)
				return mid;
			
			if(array[mid] < key)
				l = mid + 1;
			
			else
				h = mid - 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of array in sorted order : ");
		
		for(int i=0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key to be searched : ");
		int key = sc.nextInt();
		
		int result = binarySearch(array,key);
		if(result == -1)
			System.out.println("key not found in the array.");
		else
			System.out.println("key found at index : " + result);
		

	}


}
