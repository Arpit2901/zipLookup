package com.map.set.deque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain {

	public static void main(String[] args) {
		
			Map<String,Cricket> map = new HashMap<String,Cricket> ();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter number of players: ");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {


				System.out.println("Enter playername"); 
				String key = sc.next();
				System.out.println("Enter Runs");
				long runs = sc.nextLong();
				Cricket c = new Cricket(runs);


				map.put(key, c);
			}


		for (Map.Entry<String, Cricket> m : map.entrySet()) { 
				System.out.println(m.getKey() + " " + m.getValue());
			}
	}

}
