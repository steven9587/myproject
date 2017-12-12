package com.steven;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hp = 100;
		int d = -1;
		int pos = 0;
		int row = 3;
		int col = 5;

		// 下
		if (pos / col < row - 1) {
			pos = pos + col;

			// 上
			if (pos / col >= row - 2) {
				pos = pos - col;

				// 左
				if (pos % col != 0) {
					pos = pos - 1;

					// 右
					if (pos % col != col - 1) {
						pos = pos + 1;
					}
				}
			}

			while (d != 0) {
				System.out.print("請輸入方向:");
				String direction = scanner.nextLine();
				d = Integer.parseInt(direction);
				switch (d) {
				case 8:
					if (pos / col >= row - 2) {
						pos = pos - col;
						System.out.println("向上");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;

				case 4:
					if (pos % col != 0) {
						pos = pos - 1;
						System.out.println("向左");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;

				case 6:
					if (pos % col != col - 1) {
						pos = pos + 1;
						System.out.println("向右");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;

				case 2:
					if (pos / col < row - 1) {
						pos = pos + col;
						System.out.println("向下");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;
				}
				if (hp < 0) {
					System.out.println("Game Over");
				}

			}
		}
	}
}
