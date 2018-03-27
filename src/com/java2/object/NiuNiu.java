package com.java2.object;

import java.util.Random;
import java.util.Scanner;

public class NiuNiu {

	public static void main(String[] args) {
		Random random = new Random();
		String flowers = "桃心方梅";
		int porker[] = new int[52];

		System.out.print("請輸入玩家人數：");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		// 建立一套porker
		for (int i = 0; i < porker.length; i++) {
			porker[i] = i;
		}
		// 洗牌
		for (int i = 0; i < porker.length; i++) {
			int r = random.nextInt(52);
			int temp = porker[i];
			porker[i] = porker[r];
			porker[r] = temp;
		}

		for (int i = 1; i <= number * 5; i++) {
			int c = porker[i];
			System.out.println(flowers.charAt(c / 13) + "" + (c % 13 + 1));
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}
}
