package com.practise.demo;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String");
	String value = sc.nextLine();
	
	char[] chars = value.toCharArray();
	int left = 0;
	int right = value.length()-1;
	while(left<right) {
		char temp = chars[left];
		chars[left] = chars[right];
		chars[right]=temp;
		left++;
		right--;
		
	}
	

	if(Arrays.equals(chars, value.toCharArray()))
		System.out.println("Palindrome");
	else
		System.out.println("not palindrome");
	
	sc.close();

}

}
