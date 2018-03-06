package com.java2.object;

public class VendingMachine {
	private String drink;
	private int price;
	public int total = 0;
	
	public VendingMachine(String drink,int price){
		this.drink = drink;
		this.price = price;
	}
	
	
	public void print(){
		total = total + price ; 
		System.out.println(total);
	}
	
	
}
