package com.java2.collection;

import java.util.Map;
import java.util.TreeMap;

public class Main2 {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("Omega", "24");
		map.put("Alpha", "1");
		map.put("Gamma", "3");
		 for (Object key : map.keySet()) {
	            System.out.println(key + "=" + map.get(key));
	        }
	}
}
