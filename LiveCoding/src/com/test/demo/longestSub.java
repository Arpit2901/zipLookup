package com.test.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

//Time Complexity O^2;
public class longestSub {
	public static void main(String[] args) {
		String s = "GEEKSFORGEEKS";
		solve(s);

	}

	static int solve(String str) {
		Map<Integer, ArrayList<String>> m = new <Integer, ArrayList<String>>HashMap();
		if (str.length() == 0)
			return 0;
		int maxans = 0;
		for (int i = 0; i < str.length(); i++) {
			Set<Character> set = new <Character>HashSet();
			for (int j = i; j < str.length(); j++) {
				if (set.contains(str.charAt(j))) {
					maxans = Math.max(maxans, j - i);
					String s = str.substring(i, j);
					if (m.containsKey(s.length()))
						m.get(s.length()).add(s);
					else {
						m.put(s.length(), new ArrayList<String>());
						m.get(s.length()).add(s);
					}
					break;
				}
				set.add(str.charAt(j));
			}
		}
		System.out.println("longest String = " + m.get(maxans));
		return maxans;
	}
}
