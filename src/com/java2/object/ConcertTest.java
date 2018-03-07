package com.java2.object;

import java.util.Scanner;

public class ConcertTest {

	public static void main(String[] args) {
		System.out.print("請輸入購買張數：");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
	Concert customer1 = new Concert(1000, number);
	
	customer1.gettotal();
	
	}

}
