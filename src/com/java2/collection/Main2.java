package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		for (String name : nameList) {
			System.out.println(name);
		}
	}

}
