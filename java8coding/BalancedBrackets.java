package com.deepak.java8coding;

import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty())
					return false;

				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		String s = "[][()()]{}";
		System.out.println(isBalanced(s));
	}

}
