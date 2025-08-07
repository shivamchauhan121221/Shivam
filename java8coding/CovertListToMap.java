package com.deepak.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CovertListToMap {
	
	public static Map<String,Integer> conertListTOMap(List<String> str) {
		return str.stream().collect(Collectors.toMap(word->word, word->word.length()));
	}
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Java","Spring","Micorservice","Deepak");
		System.out.println(conertListTOMap(list));
	}

}
