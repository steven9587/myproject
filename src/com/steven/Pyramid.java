package com.steven;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for(int a=1;a <= n;a++){
			System.out.println("*");
		}
	}

}
