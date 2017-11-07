package com.steven;

public class Practice {

	public static void main(String[] args) {
		for (int n = 1; n < 10; n++) {
			for (int i = 2; i < 6; i++) {
				if (n * i / 10 < 1) {
					System.out.print(i + " x " + n + " =  " + (n * i) + "\t");
				}else{
					System.out.print(i + " x " + n + " = " + (n * i) + "\t");
				}
			}
			System.out.println();
		}
	}
}
