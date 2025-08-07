package com.deepak.java8coding;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelCallExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		CompletableFuture<Integer> call1 = CompletableFuture.supplyAsync(() -> serviceCall1(), executor);
		CompletableFuture<String> call2 = CompletableFuture.supplyAsync(() -> serviceCall2(), executor);

		CompletableFuture<Void> combined = CompletableFuture.allOf(call1, call2);

		combined.join(); // wait for all to complete

		Integer result1 = call1.get();
		String result2 = call2.get();

		System.out.println("Results: " + result1 + ", " + result2);
		executor.shutdown();
	}

	static Integer serviceCall1() {
		// simulate API call
		return 123455;
	}

	static String serviceCall2() {
		// simulate API call
		return "Hello Deepak";
	}
}
