package com.practise.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.logging.log4j.util.Strings;

public class StreamReverse {
	public static void main(String args[]) {
		System.out.print("enter numbers with comma");
//		Scanner sc = new Scanner(System.in);
//		String values = sc.nextLine();
		
		List<Integer> ar = List.of(1,2,3,4,5,6,7,8);
		
		//reverse using streams
		List<Integer> st = IntStream.rangeClosed(1, ar.size())
				.mapToObj(i -> ar.get(ar.size()-i))
				.collect(Collectors.toList());
		
		//filter and collect even numbers
		List<Integer> even = ar.stream()
				.filter(n -> n%2==0)
				.collect(Collectors.toList());
		even.forEach(System.out::print);
		
		//sum of squares of a list
		int sumOfSquaresOfList = ar.stream()
				.map(n -> n*n)
				.reduce(0, Integer::sum);
		System.out.println("sum"+  sumOfSquaresOfList);
		
		//Convert all Strings to Upper case
		List<String> values = List.of(" ","wrw","frwfwr","fwrfwr");
		
		List<String> upperValues = values.stream()
				.map(n -> n.toUpperCase())
				.collect(Collectors.toList());
		
		//Find the first non empty String
		String non = values.stream()
				.filter(n -> !n.isBlank())
				.limit(1).toString();
		
	//Group a list of strings by their length.
	List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
		
	Map<Integer, List<String>> groupBy = strings.stream()
			.collect(Collectors.groupingBy(n -> n.length()));
		
		
		
		
	}

}
