package com.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	// Using the Java JDK and your IDE please do the following:

	/*
	 * 1. Read the HTML data, from the provided file, which will include letters,
	 * numbers, and special characters. 2. Parse the letters, numbers and special
	 * characters in the file into individual collections. 3. First take the
	 * collection of letters and reverse them. 4. Remove numbers in the collection
	 * of only numbers that are even(2,4,6,8,etc) and leave only the odd
	 * numbers(1.3.5.7,etc) 5. Display in the console the values in each collection
	 * 
	 * “Agdfer32fdgdgs<><<<////67sgdghd…”;
	 * 
	 */
	public static void main(String[] args) {
		String str = "Agdfer32fdgdgs<><<<////67sgdghd…";
		segrate(str);
	}

	private static void segrate(String str) {
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		List<Character> charList = new ArrayList<>();
		List<Character> specialChars = new ArrayList<>();

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				Integer n = Character.getNumericValue(c);
				if (n % 2 == 0) {
					evenList.add(n);
				} else {
					oddList.add(n);
				}
			} else if (Character.isAlphabetic(c)) {
				charList.add(c);
			} else {
				specialChars.add(c);
			}
		}

		evenList.forEach(e -> System.out.print(e + " "));
		System.out.println();
		oddList.forEach(e -> System.out.print(e + " "));
		System.out.println();
		charList.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		specialChars.forEach(e -> System.out.print(e + " "));

	}

}
