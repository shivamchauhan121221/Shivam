package com.deepak.java8coding;

import java.util.Arrays;

public class StockPrice {
	public static int checkProfitStock(int arr[]) {
		int minNum = Arrays.stream(arr).min().getAsInt();
		int minIndex = 0;
		// Find the index of the minimum element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == minNum) {
				minIndex = i;
				break;
			}
		}

		// If min is the last element, no profit possible
		if (minIndex == arr.length - 1) {
			return 0;
		}

		// Find max difference after the min element
		int maxProfit = 0;
		for (int j = minIndex + 1; j < arr.length; j++) {
			maxProfit = Math.max(maxProfit, arr[j] - arr[minIndex]);
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] stockPrice = { 100, 7, 1, 5, 3, 6, 4, 50 };
		System.out.println(checkProfitStock(stockPrice));
	}

}
