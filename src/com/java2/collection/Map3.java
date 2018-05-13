package com.java2.collection;

import java.util.Map;
import java.util.TreeMap;

public class Map3 {

	public static void main(String[] args) {
		String line = "a aa abC aa ac abc bcd a";
		String[] token = line.split("\t");
		Map<String, Integer> map = new TreeMap<>();
		map.put("a", 0);
		map.put("aa", 0);
		map.put("abc", 0);
		map.put("ac", 0);
		map.put("bcd", 0);
		
		for (int a = 0; a < 8; a++) {
			switch (token[a]) {
			case "a":
				map.get("a");
				break;
			case "aa":
				break;
			case "abC":
				break;
			case "ac":
				break;
			case "abc":
				break;
			case "bcd":
				break;
			}
		}
		for (Object key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
