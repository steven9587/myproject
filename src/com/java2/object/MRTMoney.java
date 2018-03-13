package com.java2.object;

public class MRTMoney {
	protected int snumber;
	protected int lnumber;
	protected int price = 10;
	protected int total;

	public MRTMoney(int snumber, int lnumber) {
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
