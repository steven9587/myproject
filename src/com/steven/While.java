package com.steven;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		int i = 1;
		while (i <= number) {
			System.out.print(i+" ");
			i = i + 1 ;
			if (i == 11){
				break;
			}
		}
	}

}
