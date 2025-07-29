package com.practise.demo.java8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/palindrome")
	public String palindrome(int number) {
		int no = number;
		int reverse = 0;
		while(number>0) {
			int temp = number%10;
			number = number/10;
			reverse = reverse*10 + temp;

		}
		System.out.println(reverse);
		if(no == reverse)
			return "palindrome";
		else
			return "not palindrome";

		
	}
}
