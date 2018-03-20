package com.java2.object;

public class ABNumber {
	String number;

	public ABNumber(String number) {
		this.number = number;
	}

	public int validate(String secret) {
		int result = 0;
		int length = secret.length();

		for (int i = 0; i < length; i++) {
			for (int f = 0; f < length; f++) {
				char s = secret.charAt(i);
				char n = number.charAt(f);
				if (s == n) {
					if (i == f) {
						result = result + 10;
					} else {
						result = result + 1;
					}
				}
			}
		}
		return result;
	}
}
