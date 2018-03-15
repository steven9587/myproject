package com.java2.object;

import java.util.Scanner;

public class ConcertTest {

	public static void main(String[] args) {
		System.out.print("不是會員請按(1)、白金會員請按(2)、黃金會員請按(3)：");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		
		System.out.print("請輸入購買張數：");
		Scanner ticketscanner = new Scanner(System.in);
		String ticketline = scanner.nextLine();
		int ticketnumber = Integer.parseInt(ticketline);

		switch(number) {
		case 1:
		Concert customer1 = new Concert(1000, ticketnumber);
		customer1.gettotal();
		break;
		
		case 2:
		SilverConcert customer2 = new SilverConcert(1000,ticketnumber);
		customer2.gettotal();
		break;
		
		case 3:
		GoldenConcert customer3 = new GoldenConcert(1000,ticketnumber);
		customer3.gettotal();
		break;
		
		
		};

	}

}
