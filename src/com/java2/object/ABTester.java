package com.java2.object;

import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String secret = "9873";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("please enter your guess：");
			String nums = scanner.nextLine();
			ABNumber n = new ABNumber(nums);
			result = n.validate(secret);
			System.out.println(result/10+"A"+result%10+"B");
		}
	}
}
