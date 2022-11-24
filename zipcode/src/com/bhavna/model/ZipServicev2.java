package com.bhavna.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipServicev2 extends ZipServicev1 {
	List<address> list = new ArrayList<address>();
	HashMap<Long, address> hm = new HashMap<Long, address>();

	// Default contructor
	public ZipServicev2() {
		super();
		// Creating HashMap and
        // adding elements
		address data = new address("India", "Maharashtra", "pune", 200011);
		address data2 = new address("India", "Uttarpradesh", "Ghaziabad", 200014);
		address data3 = new address("India", "Bihar", "patna", 200012);
		address data4 = new address("India", "Assam", "guhati", 200013);
        hm.put((long) 200011, data);
        hm.put((long) 200014, data2);
        hm.put((long) 200012, data3);
        hm.put((long) 200013, data4);
		//Creating ArrayList
//		address data = new address("India", "Maharashtra", "pune", 200011);
//		address data2 = new address("India", "Uttarpradesh", "Ghaziabad", 200014);
//		address data3 = new address("India", "Bihar", "patna", 200012);
//		address data4 = new address("India", "Assam", "guhati", 200013);
//
//		list.add(data);
//		list.add(data2);
//		list.add(data3);
//		list.add(data4);
	}

	public void addRecord(String country, String state, String area, long code) {
		address add = new address(country, state, area, code);
		 hm.put( (long) code, add);
//		list.add(add);
		System.out.println("Successfully added");
	}

	public void search(long code) {
		 System.out.println("Value for "+code +" is " + hm.get(code));
//		int flag=5;
//		for (address x : list) {
//			if (x.getZipCode() == code) {
//				flag = 1;
//				System.out.println(x);
//			} else
//				flag = 0;
//		}
//		if (flag==0) {
//			System.out.println("The code doesn't exist");
//		}

	}

	public void allRecord() {
		   for (Map.Entry<Long, address> e : hm.entrySet())
	            System.out.println(e.getKey() + " " + e.getValue());
		//for list
//		for (address x : list)
//			System.out.println(x);
//
	}
}
