package com.practise.demo.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {
	
	public static void main(String args[]) {
      //Convert List<String> to Map<String, Integer> of string lengths
		
	  List<String> ls = List.of("abc","afewf","abc","gwrgf","gwrgfwg","gwrgwg","gwgwrgw","wfr");
	  
	  //Map<Object, List<String>> value = ls.stream().collect(Collectors.groupingBy(n -> n.length()));
	  
	  //Count the number of occurrences of words in a list
	  Map<String, Long> wordCounts = ls.stream()
			    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
  //Convert List<String> to Map<String, Integer> of string lengths
	  Map<String, Integer> va = ls.stream().collect(Collectors.groupingBy(
			  n -> String.valueOf(n.length()),
			  Collectors.summingInt(e -> 1)
			  ));
	  List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
	  
	  //Find the second highest number in a list using Streams
	  Optional<Integer> secondHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	  
	  List<Integer> prime = list.stream().filter( n -> ListToMap.isPrime(n))
			  .collect(Collectors.toList());
	  
	  List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
	 
	  //Filter and collect unique even numbers from a list

	  List<Integer> UniqueEvenNumbers = numbers.stream().distinct()
			  .filter(n -> n%2==0)
			  .collect(Collectors.toList());
	  
	  //Find the first non-repeated character in a string
	  String name = "kaatyayinika";
	  
	  Optional<Character> firstNonRepeat = name.chars()
			    .mapToObj(c -> (char) c)
			    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
			    .entrySet().stream()
			    .filter(entry -> entry.getValue() == 1)
			    .map(Map.Entry::getKey)
			    .findFirst();

			firstNonRepeat.ifPresent(System.out::println);

	  Optional<Character> firstNonRepeating = name.chars() 
			  .mapToObj( c -> (char)c)
			  .collect(Collectors.groupingBy(n -> n,LinkedHashMap :: new, Collectors.counting()))
			  .entrySet().stream()
			  .filter(entry -> entry.getValue() == 1)
			  .map(entry -> entry.getKey())
			  .findFirst();
	
	  //Merge two lists and find common elements
	  list.addAll(numbers);
	  Map<Integer, Long> findCommmon = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
	  
	  for(Map.Entry<Integer, Long> keyy : findCommmon.entrySet()) {
		if(keyy.getValue() > 1) {
			System.out.println(keyy.getKey());
		}
	  }	  
	
	
	Employee employee = new Employee("name", "dept",23);
	List<Employee> empl = new ArrayList<>();
	empl.add(new Employee("maf","fwef",12));
	empl.add(new Employee("mef","fwyf",42));
	empl.add(new Employee("marf","fwqf",35));
	
	empl.stream().collect(Collectors.groupingBy(n -> n.getDepartment()));

	//Sort a list of employees by salary, then by name

	List<Employee> sortedEmployees = empl.stream()
	        .sorted(Comparator.comparingInt(e -> ((Employee) e).getSalary())
	                .thenComparing(e -> ((Employee) e).getName()))
	        .collect(Collectors.toList());

	

	
	}
	
		
	// Method to check prime number
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }

}

class Employee {
    private String name;
    private String department;
    private Integer salary;

    // Constructor
    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    
    public Integer getSalary() {
    	return salary;
    }

    @Override
    public String toString() {
        return name;
    }
}

