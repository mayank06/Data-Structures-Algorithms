package com.practice;

import java.util.Scanner;

// binary search works only when the array is sorted
// as it searches for element in the sorted array
// it basically divides the array into two halves and looks 
// for the key element in the two halves.
// find mid element and then look for the key in the left half
// if the key is smaller than mid (assuming array sorted in ascending order)
// or on the right half if key is greater than the mid element.

public class RecursiveBinarySearch {

	public static int binarySearch(int[] array, int i, int j, int key) {
		
		if(i<j)
		{
			int mid = i + (j-i) / 2;
			if(array[mid] == key)
				return mid;
			else if(array[mid] < key)
				return binarySearch(array, i, mid, key);
			else
				return binarySearch(array, mid+1, j, key);
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
		
		int result = binarySearch(array, 0, n-1, key);
		if(result == -1)
			System.out.println("key not found in the array.");
		else
			System.out.println("key found at index : " + result);
		
	}

}
