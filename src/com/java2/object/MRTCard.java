package com.java2.object;

public class MRTCard extends MRTMoney {

	public MRTCard(int snumber, int lnumber) {
		super(snumber, lnumber);
	}

	@Override
	public void gettotal() {
		if (lnumber > snumber) {
			int number = (lnumber - snumber);
			total = (int)((number * price)*0.8);
			System.out.println(total);
		}
		if (snumber > lnumber) {
			int number = (snumber - lnumber);
			total = (int)((number * price)*0.8);
			System.out.println(total);
		}
	}
	
}
