package com.steven;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		System.out.println("�п�J�@�ӼƦr");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for(int a=1;a <= n;a++){
			System.out.println("*");
		}
	}

}
