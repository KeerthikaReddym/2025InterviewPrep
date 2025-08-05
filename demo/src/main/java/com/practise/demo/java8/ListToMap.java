package com.practise.demo.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {
	
	public static void main(String args[]) {
      //Convert List<String> to Map<String, Integer> of string lengths
		
	  List<String> ls = List.of("abc","afewf","gwrgf","gwrgfwg","gwrgwg","gwgwrgw","wfr");
	  
	  //Map<Object, List<String>> value = ls.stream().collect(Collectors.groupingBy(n -> n.length()));
	  
	  Map<String, Integer> va = ls.stream().collect(Collectors.groupingBy(
			  n -> String.valueOf(n.length()),
			  Collectors.summingInt(e -> 1)
			  ));
	  List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
	  
	  List<Integer> prime = list.stream().filter( n -> ListToMap.isPrime(n))
			  .collect(Collectors.toList());
			  
			  

	  
	}
	// Method to check prime number
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }

}
