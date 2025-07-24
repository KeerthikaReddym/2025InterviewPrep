package com.practise.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class FindDuplicatesInArray {

	public static void main(String args[]) {
		
		System.out.print("enter numbers with comma");
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		
		  // Convert the string to an int array using streams
		 int[] intArray = Arrays.stream(values.split(","))
                 .map(String::trim)
                 .mapToInt(Integer::parseInt)
                 .toArray(); 
		 findDuplicateUsingSet(intArray);

	}
	
	public static void findDuplicates(int[] intArr) {
		List<Integer> arr = Arrays.stream(intArr).boxed().collect(Collectors.toList());
		Collections.sort(arr);
		
		for(int i =0; i<arr.size()-1;i++) {
			if(arr.get(i)==arr.get(i+1)) {
				System.out.println(arr.get(i)+ " ");

			}
		}
	}
	public static void findDuplicateUsingSet(int[] intArr) {
		Set<Integer> values = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		
		for(Integer i : intArr) {
			if(!values.add(i)) {
				duplicates.add(i);
			}
		}
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> cw  = new HashSet<>();
		
		for(Integer in : intArr) {
			if(!seen.add(in)) cw.add(in);
		}
		
		
		duplicates.forEach(System.out::println);
		
	}
	
	
}
