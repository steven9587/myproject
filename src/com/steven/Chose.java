package com.steven;

import java.util.Scanner;

public class Chose {
	public static void main(String[] args) {
		System.out.println("以下誰年紀最大?");
		System.out.println("(1)周杰倫");
		System.out.println("(2)華辰宇");
		System.out.println("(3)梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		
		if(age == 3){
			System.out.println("答對啦!");
		}else{
			System.out.println("答錯了!");
		}
	}

}
