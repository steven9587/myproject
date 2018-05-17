package com.java2.collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {

	public static void main(String[] args) {
		boolean a;
		Set<String> nameSet = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		while (a = scanner.nextLine() != null) {
			String line = scanner.nextLine();
			nameSet.add(line);
		}
		nameSet.remove("6");
		for (String name : nameSet) {
			System.out.println(name);
		}
	}

}
