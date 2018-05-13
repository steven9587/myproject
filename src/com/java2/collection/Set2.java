package com.java2.collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		for (String name : nameSet) {
			System.out.println(name);
		}
	}

}
