package com.java2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(1);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("Jack");
		set2.add("Hank");
		set2.add("Eric");
		set2.add("Hank");
		System.out.println(set2);
	}

}