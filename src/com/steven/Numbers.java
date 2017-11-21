package com.steven;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		for (int i = 1; i <= number; i++) {
			if(i%3==0){
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
