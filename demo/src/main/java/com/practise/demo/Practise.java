package com.practise.demo;

import java.util.Scanner;

public class Practise {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		
		sc.close();
		
		if(number <=2)
			System.out.println("no prime numbers");
		else {
			
			for(int i=2;i<=number;i++) {
				boolean IsPrime = true;
				for(int j=1;j*j<i;j++) {
					if(j%i==0) {
						IsPrime = false;
						break;
					}
				}
				if(IsPrime == true) {
					System.out.println(" "+ i);
				}
		}

	}

}

}