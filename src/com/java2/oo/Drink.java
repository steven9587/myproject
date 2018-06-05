package com.java2.oo;

public class Drink {
	int id;
	String name;
	int price;
	//多寫一個空的建構子是為了滿足JavaBean
	//JavaBean：一個空的建構子與getter setter
	public Drink(){
		
	}

	public Drink(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPrice(int price){
		this.price=price;
	}
	
	public int getprice(){
		return price;
	}
}
