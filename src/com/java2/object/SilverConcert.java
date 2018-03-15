package com.java2.object;

public class SilverConcert extends Concert {

	public SilverConcert(int price, int number) {
		super(price, number);
	}

	@Override
	public void gettotal() {
		int total = (int)((price * number)*0.8);
		System.out.println("總金額：" + total);
	}
}
