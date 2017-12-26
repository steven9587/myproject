package com.ibm;

import java.util.Scanner;

public class Vendingmachine {

	public static void main(String[] args) {
		int sum = 0;

		for (int a = 1; a > 0; a++) {
			System.out.println("販賣機餘額：" + sum);
			System.out.print("請投幣或選擇飲料(a或b或c),或輸入0結束：");
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
