package com.cricket.match;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String teamName;
		int matches;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,TeamName,matches");
		name=sc.next();
		teamName=sc.next();
		matches=sc.nextInt();
		playerDetails obj=new playerDetails(name, teamName, matches);
		List <String>list=new ArrayList<String>();
		 list.add(name);  
		 list.add(teamName);  
		 list.add(String.valueOf(matches));
		 for(String ele:list)  
			 obj.record(ele);
			  
		
		 
	}

}
