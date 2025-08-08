package com.practise.demo.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repested {

	public static void main(String args[]) {

	List<Integer> ls = List.of(1,2,3,4,5,6,7,8,9,10);
	List<int[]> indexes = new ArrayList<>();

	
	int target = 10;
	
	Map<Integer, Integer> map = new HashMap<>();
	
	for(int i=0;i<ls.size();i++) {
		
		int remaining = target - ls.get(i);
		
		if(map.containsKey(remaining)) {
			indexes.add(new int[] {map.get(remaining), i});
		}
		
		map.putIfAbsent(ls.get(i), i);
		
		
	}
	
    // Print all pairs
    if (indexes.isEmpty()) {
        System.out.println("No pairs found.");
    } else {
        for (int[] pair : indexes) {
            System.out.println("Indexes: " + pair[0] + ", " + pair[1]);
        }
    }

	
	//map = ls.stream().collect(Collectors.groupingBy(n->n, n->n.index))
	
	
	}
	

}
