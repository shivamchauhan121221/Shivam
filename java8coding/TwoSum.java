package com.deepak.java8coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {

	public static List<int[]> findAllPairs(int[] nums, int target) {
		Set<Integer> seen = new HashSet<>();
		Set<String> usedPairs = new HashSet<>();
		List<int[]> result = new ArrayList<>();

		for (int num : nums) {
			int complement = target - num;
			if (seen.contains(complement)) {
				// Ensure uniqueness (e.g., [2,5] and [5,2] are same)
				int small = Math.min(num, complement);
				int large = Math.max(num, complement);
				String key = small + "," + large;
				if (!usedPairs.contains(key)) {
					result.add(new int[] { small, large });
					usedPairs.add(key);
				}
			}
			seen.add(num);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 3, 5, 1 ,2,3,2,3,4};
		int target = 6;

		List<int[]> pairs = findAllPairs(nums, target);
		for (int[] pair : pairs) {
			System.out.println(Arrays.toString(pair));
		}
	}
}
