package com.practise.demo;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Anagram {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		
		anagram(n1,n2);
	}

	public static void anagram(String nf, String ns) {
		
		if(nf.length() != ns.length()) {
			System.out.println("Not Anagram");
		}
		List<Character> nfl = nf.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> nsl = ns.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		
		Collections.sort(nfl);
		Collections.sort(nsl);
		
		if(nfl.equals(nsl)) {
			System.out.println("Anagram");
		}

	}

}
