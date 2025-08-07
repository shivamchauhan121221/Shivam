package com.deepak.java8coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TwoNumberSumFinder {

//There is array [ 5, 7 , 3, 8, 9 ,10, 21,5,3,7], write method to find the two array elements whose sum is N

	public static Optional<int[]> findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return Optional.of(new int[] { map.get(complement), i });
			}
			map.put(nums[i], i);
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		int[] nums = { 4, 7, 3, 8, 9, 10, 21, 5, 3, 7 };
		int target = 10;

		Optional<int[]> result = findTwoSum(nums, target);

		if (result.isPresent()) {
			int[] indixes = result.get();
			System.out.println("Indexes of elements whose sum equals " + target + ": " + Arrays.toString(indixes));
			System.out.println("Elements: " + nums[indixes[0]] + " , " + nums[indixes[1]]);
		} else {
			System.out.println("No two elements found with the sum equal to " + target);

		}
	}

}
