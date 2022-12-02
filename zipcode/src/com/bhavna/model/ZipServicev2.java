package com.bhavna.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipServicev2 extends ZipServicev1 {
	static HashMap<Long, address> hm = new HashMap<Long, address>();
	static {
		address data = new address("India", "Maharashtra", "pune", 200011);
		address data2 = new address("India", "Uttarpradesh", "Ghaziabad", 200014);
		address data3 = new address("India", "Bihar", "patna", 200012);
		address data4 = new address("India", "Assam", "guhati", 200013);

		hm.put((long) 200011, data);
		hm.put((long) 200014, data2);
		hm.put((long) 200012, data3);
		hm.put((long) 200013, data4);
		// instance block
	}

	public void addRecord(String country, String state, String area, long code) {// if same zip code enters
		Iterator hmIterator = hm.entrySet().iterator();
		boolean flag = false;
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int zipcode = ((int) mapElement.getKey());
			if (zipcode == code) {
				flag = true;
				break;
			} else
				flag = false;
		}
		if (!flag) {
			address add = new address(country, state, area, code);
			hm.put(code, add);
			System.out.println("Successfully added");
		} else
			System.out.println("code is already registered try another");
	}

	public void search(long code) {// for wrong pincode now throw exception
		if (hm.get(code) == null) {
			System.out.println("zipvalue not matched in the list please enter a valid zip");
		} else
			System.out.println("Value for " + code + " is " + hm.get(code));
	}

	public void allRecord() {
		for (Map.Entry<Long, address> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

	}
}
