package com.java2.object;

import java.util.Random;

public class Porker {

	public static void main(String[] args) {
	
		String flowers = "桃心方梅";
		int porker[] = new int[52];
		for (int i = 0; i < porker.length; i++) {
			porker[i] = i;
			System.out.println(flowers.charAt(i / 13)+""+(porker[i] % 13 + 1));
		}
		
	}

}
