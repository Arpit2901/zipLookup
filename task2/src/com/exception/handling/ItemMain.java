package com.exception.handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name id and price");
		Scanner sc =new Scanner(System.in);
		String name=sc.next();
		int id=sc.nextInt();
		double price=sc.nextDouble();
		try {
			List <ItemDetails> list=new ArrayList<ItemDetails>();
			ItemDetails item=new ItemDetails(id, price, name);
			
			list.add(item);
			if(id==0) {
				list.add(item);	
			}
			if(list.isEmpty()) {
				throw new CartEmptyException("CartEmptyException raised!");
			}else {
				for(ItemDetails itm:list) {
					System.out.println(itm.getItemID()+"\t"+itm.getName()+"\t"+itm.getPrice());
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		
	}
	