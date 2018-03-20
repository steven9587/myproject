package com.java2.object;

public class ABGame {

	public static void main(String[] args) {
		int b  = 0;
		int a = 0;
		
		String secret = "9873";
		String nums = "7893";
		int length = secret.length();
		//判斷B
		for (int i = 0; i < length; i++) {
			for (int f = 0; f < length; f++) {
				char s = secret.charAt(i);
				char n = nums.charAt(f);
				if(s == n && i!=f){
					b=b+1;
				}
				
				
			}
		}
		//判斷A
		for (int i = 0; i < length; i++) {
				char s = secret.charAt(i);
				char n = nums.charAt(i);
				if(s == n){
					a=a+1;
			}
		}
		
		System.out.println(a+"A"+b+"B");
	}

}
