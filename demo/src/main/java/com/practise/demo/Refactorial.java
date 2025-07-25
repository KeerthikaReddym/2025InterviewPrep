package com.practise.demo;

import java.util.Scanner;

public class Refactorial {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	
	int value = refactorial(n);
	System.out.println(value);
	}
	public static int refactorial(int n) {
		
		if(n<2)
			return 1;
		
		return n*refactorial(n-1);
		
	}

}
