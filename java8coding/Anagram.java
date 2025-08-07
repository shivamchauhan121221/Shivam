package com.deepak.java8coding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

	/* replace(" ", "") --> remove only spaces */
	/* replaceAll("\\s", "") --> All whitespace (spaces, tabs, newlines) */
	/* replaceAll("[^a-zA-Z]", "") --> remove All non-alphabet characters */
	/* replaceAll("(?i)[^b-df-hj-np-tv-z]", "") --> (?i)->makes the pattern
	   case-insensitive and [^b-df-hj-np-tv-z] --> remove everything except
	   consonants */
	/* replaceAll("(?i)[^aeiou]", "") --> remove everything except
	   Vowels */

	public static String checkAnagram(String str1, String str2) {

		str1 = Arrays.stream(str1.replaceAll("[^a-zA-Z]", "").split("")).map(String::toUpperCase).sorted()
				.collect(Collectors.joining());
		str2 = Arrays.stream(str2.replaceAll("[^a-zA-Z]", "").split("")).map(String::toUpperCase).sorted()
				.collect(Collectors.joining());
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		if (str1.equals(str2))
			return "String is Anagram";
		else
			return "String is not Anagram";

	}

	public static void main(String[] args) {
		String str1 = "  @Dee   " + "          p@ak ";
		String str2 = "    #EEDP$ ak   ";
		System.out.println(checkAnagram(str1, str2));

	}

}
