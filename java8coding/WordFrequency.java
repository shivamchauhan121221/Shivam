package com.deepak.java8coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
	public static Map<String, Long> frequencyCount(String s) {

		return Arrays.stream(s.replaceAll("[^a-zA-Z ]", "").split(" ")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));

	}

	public static void main(String[] args) {
		String s = "hi, how are you? hi";
		Map<String, Long> wordCount = frequencyCount(s);
		wordCount.forEach((word, count) -> System.out.println(word + " " + count));

	}
}
