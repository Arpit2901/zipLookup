package com.dao.calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj=new Calculation();
		System.out.println(obj.add(5, 7));
		System.out.println(obj.add(5.0, 7.0));
		System.out.println(obj.add('a', 'b'));
		System.out.println(obj.division(14.0, 7.0));
		System.out.println(obj.multiplication(5, 7));
		System.out.println(obj.subtract(5, 3));
	}

}
