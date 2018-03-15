package com.java2.object;

public class GoldenConcert extends SilverConcert {

	public GoldenConcert(int price, int number) {
		super(price, number);
	}

	@Override
	public void gettotal() {
		int total = (int) ((price * number) * 0.8);
		int red = (int) ((price * number) * 0.2);
		System.out.println("總金額：" + total + "\t" + "回饋金：" + red);
	}
}
