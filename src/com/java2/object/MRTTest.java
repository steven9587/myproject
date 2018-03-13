package com.java2.object;

import java.util.Scanner;

public class MRTTest {

	public static void main(String[] args) {
		System.out.println("請選擇付費方式，投幣請選(1)、刷悠遊卡請選(2)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int answer = Integer.parseInt(line);
		if (answer == 1) {
			System.out.print("請輸入此站代號：");
			Scanner sscanner1 = new Scanner(System.in);
			String sline1 = sscanner1.nextLine();
			int snumber1 = Integer.parseInt(sline1);

			System.out.print("請輸入目的地代號：");
			Scanner lscanner1 = new Scanner(System.in);
			String lline1 = lscanner1.nextLine();
			int lnumber1 = Integer.parseInt(lline1);

			MRTMoney customer1 = new MRTMoney(snumber1, lnumber1);
			customer1.gettotal();
		} else {
			System.out.print("請輸入此站代號：");
			Scanner sscanner2 = new Scanner(System.in);
			String sline2 = sscanner2.nextLine();
			int snumber2 = Integer.parseInt(sline2);

			System.out.print("請輸入目的地代號：");
			Scanner lscanner2 = new Scanner(System.in);
			String lline2 = lscanner2.nextLine();
			int lnumber2 = Integer.parseInt(lline2);

			MRTCard customer2 = new MRTCard(snumber2, lnumber2);
			customer2.gettotal();
		}
	}
}
