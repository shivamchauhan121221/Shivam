package com.deepak.java8coding;

import java.util.Arrays;

public class MissingLeastNumber {

	public static int findLeastMissingNumber(int[] arr) {
		return Arrays.stream(arr).boxed().sorted().filter(a -> a > 0).reduce(1, (previous, current) -> {
			if (previous == current) {
				return previous + 1;
			} else {
				return previous;
			}
		});
	}

	public static void main(String[] args) {
		
		int[] arr= {67,45,3,1,2,9,2,10,90,1,4,5};
		System.out.println(findLeastMissingNumber(arr));

	}

}
