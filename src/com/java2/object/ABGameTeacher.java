package com.java2.object;

import java.util.Scanner;

public class ABGameTeacher {
 
	public static void main(String[] args) {
		int b = 0;
		int a = 0;

		while (a != 4) {
			a = 0 ;
			b = 0 ;
			System.out.print("please enter your guess：");
			Scanner scanner = new Scanner(System.in);
			String nums = scanner.nextLine();

			String secret = "9873";

			for (int i = 0; i < secret.length(); i++) {
				for (int f = 0; f < secret.length(); f++) {
					char s = secret.charAt(i);
					char n = nums.charAt(f);
					if (s == n) {
						if (i == f) {
							a = a + 1;
						} else {
							b = b + 1;
						}
					}
				}
			}
			System.out.println(a + "A" + b + "B");
		}

	}
}