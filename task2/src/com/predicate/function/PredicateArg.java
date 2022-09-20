package com.predicate.function;

import java.util.function.Predicate;

public class PredicateArg {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        myPredicate(19,(age)->age>=18);
   }



   public static void myPredicate(int age, Predicate<Integer> ref) {
        // TODO Auto-generated method stub
        if(age>=18) {
            System.out.println("You are Eligible");
        }else {
            System.out.println("You are Not Eligible");



       }
    }

}
