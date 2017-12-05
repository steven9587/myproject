package com.steven;

public class Sorting {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i++) {
			for (int f = i+1; f < n.length; f++) {
				if (n[f] < n[i]) {
					int tmp = n[f];
					n[f] = n[i];
					n[i] = tmp;
				}
			}
			System.out.println(n[i]);
		}
	}
}
