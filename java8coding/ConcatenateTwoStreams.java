package com.deepak.java8coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {

	/* Concatenate two Array Strings or Strings */
	public static String concateString(String[] str1, String[] str2) {
		return Stream.concat(Arrays.stream(str1), Arrays.stream(str2)).collect(Collectors.joining(" "));
	}

	/* Count Vowels in subString of given String? */
	public static Map<String, Long> vowelCount(String str) {
		return Arrays.stream(str.split(" ")).map(String::toLowerCase).collect(
				Collectors.toMap(word -> word, word -> word.chars().filter(ch -> "aeiou".indexOf(ch) != -1).count(),(existing, replacement) -> existing,LinkedHashMap::new));
	}

	public static void main(String[] args) {
		String str1[] = { "my name is java", "hello Deepak" };
		String str2[] = { "I love java and ms", "Hi Mishra" };
		System.out.println(concateString(str1, str2));

		String str = "Deepak Mishra has nine years of experience";
		System.out.println(vowelCount(str));
	}
}
