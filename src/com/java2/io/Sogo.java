package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Sogo {

	Scanner scanner = new Scanner(System.in);

	public Sogo() {

	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showFunction();
			function = scanner.nextInt();
			switch (function) {
			case 1:
				getsales();
				break;
			case 3:
				return;
			}
		}
	}

	public void getsales() {
		try {
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.println("請輸入會員等級");
			int type = scanner.nextInt();
			System.out.println("清輸入購買金額");
			int amount = scanner.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void showFunction() {
		System.out.println("請輸入功能(1~3)");
		System.out.println("(1)輸入銷售紀錄");
		System.out.println("(2)印出銷售報表");
		System.out.println("(3)結束程式");
	}

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}
}
