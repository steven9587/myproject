package com.ibm;

import java.util.Scanner;

public class Vendingmachine {

	public static void main(String[] args) {
		int sum = 0;

		for (int a = 1; a > 0; a++) {
			System.out.println("�c����l�B�G" + sum);
			System.out.print("�Ч���ο�ܶ���(a��b��c),�ο�J0�����G");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int money = Integer.parseInt(line);

			if (money == 1) {
				sum = sum + 1;
				System.out.println(sum);

			} else {
				if (money == 5) {
					sum = sum + 5;
					System.out.println(sum);

				} else {
					if (money == 10) {
						sum = sum + 10;
						System.out.println(sum);

					} else {
						 
					}
				}
			}
		}
	}

}
