package com.java2.object;

public class Concert {
	
	private int price = 1000;
	private int number;
	
	public Concert(int price,int number){
		this.price = price;
		this.number = number;
	}
	
	public void gettotal(){
		int total =(price*number);
	}
	
	
}
