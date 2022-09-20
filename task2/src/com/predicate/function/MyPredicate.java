package com.predicate.function;

import java.util.function.Predicate;

public class MyPredicate {

	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Predicate<Integer> ref= (age)->age>=18;
	        System.out.println(ref.test(25));
	        System.out.println(ref.test(10));
	   }

}
