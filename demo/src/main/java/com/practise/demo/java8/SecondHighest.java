package com.practise.demo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
	public static void main(String args[]) {
		
		int[] numbers = {1,2,5,4,3,6,8,2};
		
	
		Optional<Integer> number = Arrays.stream(numbers)
				.boxed()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		
		number.ifPresentOrElse(n -> System.out.println(number),() -> System.out.printf("number not there"));
				

	}

}
