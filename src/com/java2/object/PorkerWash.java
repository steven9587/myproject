package com.java2.object;

import java.util.Random;

public class PorkerWash {

	public static void main(String[] args) {
		Random random = new Random();
		String flowers = "桃心方梅";
		int porker[] = new int[52];
		// 把數字放進去
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

		for (int i = 0; i < porker.length; i++) {
			int c = porker[i];
			System.out.println(flowers.charAt(c / 13) + "" + (c % 13 + 1));
		}
	}

}
