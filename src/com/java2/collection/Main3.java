package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		String[] strArray = nameList.toArray(new String[0]);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}
