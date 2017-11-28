package com.steven;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);

		int n[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			for (int i = 0;i<n.length;i++)
				if (number > n[i]){
					number = number - n[i];
				} else {
					System.out.println( (i+1) +"月"+number+"日");
					break;
		}
	}

}
