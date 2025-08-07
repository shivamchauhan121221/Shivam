package com.deepak.java8coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

	public static Map<String, Integer> sortHashMapByKey(Map<String, Integer> unsortedMap) {
		return unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (newValue, oldValue) -> newValue, LinkedHashMap::new));
	}

	public static Map<String, Integer> sortHashMapByValue(Map<String, Integer> unsortedMap) {
		return unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (newValue, oldValue) -> newValue, LinkedHashMap::new));
	}

	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("apple", 3);
		unsortedMap.put("zanana", 3);
		unsortedMap.put("apiple", 3);
		unsortedMap.put("apiple", 4);
		unsortedMap.put("orange", 1);

		// Sort the HashMap by keys
		System.out.println("Sorted HashMap by Key: " + sortHashMapByKey(unsortedMap));

		// Sort the HashMap by values
		System.out.println("Sorted HashMap by Value: " + sortHashMapByValue(unsortedMap));
	}
}
