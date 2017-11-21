package com.steven;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		System.out.print("請輸入您的分數:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		switch (number/10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("Good");
			break;
		case 8:
			System.out.println("Great");
			break;
		case 9:
		case 10:
			System.out.println("Excellent");
			break;
		}
	}
}
