package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("postgres", "sqlite", "oracle", "mongodb", "postgres", "mssql"));
		System.out.println(list.size());
		Set<String> nameSet = new TreeSet<>(
				Arrays.asList("postgres", "sqlite", "oracle", "mongodb", "postgres", "mssql"));
		for (String name : nameSet) {
			System.out.println(name);
		}
	}

}
