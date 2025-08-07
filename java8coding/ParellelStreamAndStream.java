package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;

public class ParellelStreamAndStream {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

		System.out.println("---- Using stream() ----");
		names.stream().forEach(name -> {
			System.out.println(Thread.currentThread().getName() + " processing " + name);
			simulateWork();
		});

		System.out.println("\n---- Using parallelStream() ----");
		names.parallelStream().forEach(name -> {
			System.out.println(Thread.currentThread().getName() + " processing " + name);
			simulateWork();
		});

		System.out.println("\n---- Using parallelStream() with forEachOrdered ----");
		names.parallelStream().forEachOrdered(name -> {
			System.out.println(Thread.currentThread().getName() + " processing " + name);
			simulateWork();
		});
	}

	// Simulate some CPU-bound work
	private static void simulateWork() {
		try {
			Thread.sleep(100); // Simulate work (100ms delay)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
