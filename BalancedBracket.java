package com.greatlearning.bracketproblem;

import java.util.Stack;

public class BalancedBracket {
	
	Stack<Character> stack = new Stack<Character>();
	
	public  boolean checkBalancedBrackets(String str1) {
		
		
		for (char x : str1.toCharArray()) {

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check != '(')
					return false;
				break;
			case '}':
				check = stack.pop();
				if (check != '{')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check != '[')
					return false;
				break;
			}
		}
		return (stack.isEmpty());

	}

}
