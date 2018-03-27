package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Porker2 {

	public static void main(String[] args) {
		Random random = new Random();
		String flowers = "桃心方梅";
		List<Integer> porker = new ArrayList();
		// 把數字放進去
		for (int i = 0; i <52; i++) {
			porker.add(i);
		}
		// 洗牌
		for (int i = 0; i < 52; i++) {
			int r = random.nextInt(52);
			porker.add(porker.get(r));
		}

		for (int i = 0; i < 52; i++) {
			System.out.println(flowers.charAt(porker.get(i) / 13) + "" + (porker.get(i) % 13 + 1));
		}
	}

}
