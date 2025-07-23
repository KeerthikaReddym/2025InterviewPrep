package com.practise.demo;

import java.util.Scanner;

public class IntegerReverse {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int number = sc.nextInt();
	int no = number;
	int reverse = 0;
	sc.close();
	
	while(number>0) {
		int temp = number%10;
		number = number/10;
		reverse = reverse*10 + temp;

	}
	System.out.println(reverse);
	if(no == reverse)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");


	


}
}
