package com.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {
	static List<Product> productsList = new ArrayList<Product>();
	static Map<String,Product> m= new HashMap <String,Product>();
	static {
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
	}

	public static void main(String[] arg) {
	test1();
//	testn();
//		test6();
	}
//Comparator.comparingDouble(Product::getPrice)
//Stream with collector
	static void test1() {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		List l=(List) productsList.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
	}
	static void testn() {
		m=productsList.stream().collect(Collectors.toMap(Product::getName, Function.identity()));
		System.out.println("map%^&*"+m);
	}

//stream with map
	static void test2() {
		Set<Float> productPriceList = productsList.stream().map(x -> x.getPrice()) // fetching price
				.collect(Collectors.toSet()); // collecting as set
		System.out.println(productPriceList);
	}
	// using sum and average methods of collector

	static void test3() {
		Double sum = productsList.stream().collect(Collectors.summingDouble(s -> s.getPrice()));
		System.out.println("sum=" + sum);
		Double avg = productsList.stream().collect(Collectors.averagingDouble(x -> x.getPrice()));
		System.out.println("average=" + avg);
	}
//longest string in the list

	static void test4() {
		List<String> Stream = Arrays.asList("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
		String out = Stream.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
		System.out.println("out=" + out);
	}

	// Print the found duplicate elements
	static void test5() {
		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		Set s = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
		System.out.println(s);
	}

//  use of StringJoiners 
	static void test6() {
		StringJoiner joinNames = new StringJoiner(",", "[", "]");
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);
	}
}
