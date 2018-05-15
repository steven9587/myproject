package com.java2.collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {

	public static void main(String[] args) {
		Set<String> nameSet = new TreeSet<>(
				Arrays.asList("6","postgres", "sqlite", "oracle", "mongodb", "postgres", "mssql"));
		nameSet.remove("6");
		for (String name : nameSet) {
			System.out.println(name);
		}
	}

}
