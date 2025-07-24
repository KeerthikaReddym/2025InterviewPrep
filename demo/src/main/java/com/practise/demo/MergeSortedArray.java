package com.practise.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeSortedArray {
	
	public static void main(String args[]) {
		System.out.print("enter numbers with comma");
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		int kth = sc.nextInt();
		
		  // Convert the string to an int array using streams
		 int[] intArray = Arrays.stream(values.split(","))
                 .map(String::trim)
                 .mapToInt(Integer::parseInt)
                 .toArray(); 
			System.out.print(findKthLargestNumber(intArray, kth));

      // find kth largest element in the array
		
	}

	public static int findKthLargestNumber(int[] intArr, int kth) {
		List<Integer> arr = new ArrayList<>();
		Set<Integer> ar = new HashSet<>();
		ar = Arrays.stream(intArr).boxed().collect(Collectors.toSet());
	      // find kth largest element in the array
		
			arr = ar.stream().collect(Collectors.toList());
			Collections.sort(arr);
			int va = (ar.size()-kth);
			
			return arr.get(va);
			
	}

}
