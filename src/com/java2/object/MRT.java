package com.java2.object;

public class MRT {
	private int snumber;
	private int lnumber;
	private int price = 10;
	private int total;

	public MRT(int snumber, int lnumber) {
		this.snumber = snumber;
		this.lnumber = lnumber;
	}

	public void gettotal() {
		if (lnumber > snumber) {
			int number = (lnumber - snumber);
			total = number * price;
			System.out.println(total);
		}
		if (snumber > lnumber) {
			int number = (snumber - lnumber);
			total = number * price;
			System.out.println(total);
		}
	}

}
