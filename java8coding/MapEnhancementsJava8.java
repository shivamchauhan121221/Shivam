package com.deepak.java8coding;

import java.util.HashMap;
import java.util.Map;

public class MapEnhancementsJava8 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
        // Java-8
		// 1. forEach
		map.put("one", "1");
		map.put("two", "2");
		map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

		// 2. getOrDefault
		String value = map.getOrDefault("three", "default");
		System.out.println("getOrDefault: " + value);

		// 3. putIfAbsent
		map.putIfAbsent("three", "3");
		System.out.println("putIfAbsent: " + map);

		// 4. remove(key, value)
		boolean removed = map.remove("three", "3");
		System.out.println(" Data Removed 'three': " + removed);

		// 5. replace(key, value)
		map.replace("two", "22");
		System.out.println("Replaced 'two': " + map);

		// 6. replace(key, oldValue, newValue)
		map.replace("one", "1", "11");
		System.out.println("Replaced 'one' with condition: " + map);

		// 7. compute
		map.compute("four", (k, v) -> (v == null) ? "4" : v + "-updated");
		System.out.println("After compute: " + map);

		// 8. computeIfAbsent
		map.computeIfAbsent("five", k -> "5");
		System.out.println("After computeIfAbsent: " + map);

		// 9. computeIfPresent
		map.computeIfPresent("five", (k, v) -> v + "-present");
		System.out.println("After computeIfPresent: " + map);

		// 10. merge
		map.merge("six", "6", (oldVal, newVal) -> oldVal + "," + newVal);
		map.merge("six", "7", (oldVal, newVal) -> oldVal + "," + newVal);
		System.out.println("After merge: " + map);

		// Java 9 - Immutable Maps
		Map<String, String> immutableMap = Map.of("a", "A", "b", "B");
		System.out.println("Map.of: " + immutableMap);

		Map<String, Integer> entryMap = Map.ofEntries(Map.entry("one", 1), Map.entry("two", 2), Map.entry("three", 3));
		System.out.println("Map.ofEntries: " + entryMap);

		// Java 10 - var (type inference)
		var inferredMap = Map.of("x", 100, "y", 200);
		System.out.println("Inferred Map: " + inferredMap);

		// Java 16 - Map.copyOf()
		Map<String, String> copy = Map.copyOf(map);
		System.out.println("Map.copyOf: " + copy);

		// Uncomment below line to see exception for immutable map mutation
		// immutableMap.put("c", "C"); // Throws UnsupportedOperationException
	}

}
