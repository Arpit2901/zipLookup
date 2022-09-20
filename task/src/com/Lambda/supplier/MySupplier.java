package com.Lambda.supplier;

import java.util.function.Supplier;

public interface MySupplier {
	   public static void main(String args[])
	    {
	        // Consumer to display a number
	        Supplier<Double> ref = () -> Math.random();
	        System.out.println(ref.get());

	        // Implement display using accept()
//	        ref.accept(10);
	}
}
