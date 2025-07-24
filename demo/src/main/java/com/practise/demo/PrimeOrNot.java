package com.practise.demo;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int number = sc.nextInt();
	
	boolean IsPrime = true;
	
	if(number%2==0) {
		System.out.println("not a prime number");
	}
	else {
		for(int i=2;i<number/2;i++) {
			IsPrime = true;
			if(i%number==0) {
				IsPrime = false;
				break;
			}
		}
		if(IsPrime) {
			System.out.println("A prime number");

		}
	}
	
	sc.close();
	

}
}
