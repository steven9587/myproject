package com.steven;

import java.util.Scanner;

public class Chose {
	public static void main(String[] args) {
		System.out.println("�H�U�֦~���̤j?");
		System.out.println("(1)�P�N��");
		System.out.println("(2)�ب��t");
		System.out.println("(3)��°�");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		
		if(age == 3){
			System.out.println("�����!");
		}else{
			System.out.println("�����F!");
		}
	}

}
