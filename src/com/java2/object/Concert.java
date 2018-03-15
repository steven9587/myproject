package com.java2.object;

public class Concert {
	
	protected int price = 1000;
	protected int number;
	
	public Concert(int price,int number){
		this.price = price;
		this.number = number;
	}
	
	public void gettotal(){
		int total =(price*number);
		System.out.println("總金額："+total);
	}
	
	
}
