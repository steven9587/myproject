package com.java2.object;

import java.util.Scanner;

public class MRTTest {

	public static void main(String[] args) {
		
		System.out.print("請輸入此站代號：");
		Scanner sscanner = new Scanner(System.in);
		String sline = sscanner.nextLine();
		int snumber = Integer.parseInt(sline);
		
		System.out.print("請輸入目的地代號：");
		Scanner lscanner = new Scanner(System.in);
		String lline = lscanner.nextLine();
		int lnumber = Integer.parseInt(lline);
		
		MRT customer = new MRT(snumber,lnumber);

		customer.gettotal();
		
	}

}
