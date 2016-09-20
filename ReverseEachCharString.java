package com.practice;

import java.util.Scanner;

public class ReverseEachCharString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(reverseString(str));
		

	}
	
	public static String reverseString(String s) {
		
		if (s == null || s.length() == 0) {
			return "";
		}
 
		
		// split to words by space
		//String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) {
			if (!s.equals("")) {
				sb.append(s.charAt(i));
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length());
	}
		
}
