package com.java2.object;

public class ABGameTeacher {

	public static void main(String[] args) {
		int b = 0;
		int a = 0;

		String secret = "9873";
		String nums = "7893";
		int length = secret.length();

		for (int i = 0; i < length; i++) {
			for (int f = 0; f < length; f++) {
				char s = secret.charAt(i);
				char n = nums.charAt(f);
				if (s == n) {
					if (i == f) {
						a = a + 1;
					} else {
						b = b + 1;
					}
				}
			}
		}
		System.out.println(a + "A" + b + "B");
	}

}
