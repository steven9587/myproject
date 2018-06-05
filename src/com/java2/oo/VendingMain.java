package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VendingMain {

	public static void main(String[] args) {
		VendingMaching vm = new VendingMaching();

		try {
			FileReader fr = new FileReader("vending.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for (int i = 1; i <= count; i++) {
				String name = tokens[i * 2 - 1];
				int price = Integer.parseInt(tokens[i * 2]);
				vm.drinks.add(new Drink(i, name, price));
			}
			vm.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}