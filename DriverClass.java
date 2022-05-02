package com.greatlearning.bracketproblem;

import java.util.Scanner;


public class DriverClass {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		
		BalancedBracket bb = new BalancedBracket();
		
		if (bb.checkBalancedBrackets(expr)) {
			System.out.println("The brackets are balanced");
		}
		else {
			System.out.println("The brackets are not balanced");
		}
		sc.close();
	}

	

}
