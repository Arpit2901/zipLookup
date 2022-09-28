package com.test.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dao.calculator.Calculation;

public class Testing {
	
	Calculation obj=new Calculation();
	
	@BeforeClass  
	public static void setUpBeforeClass() throws Exception {  
		System.out.println("before class");  
	}  
	@Before
	public  void beforeAllDemo() {
		System.out.println("before all");
	}
	   @Test
	    public void testCheckAddition() {
	        int actualResult = obj.add(5,7);
	        assertEquals(12, actualResult);
	    }
	   @Test
	    public void testCheckDouble() {
	        double actualResult = obj.add(4.0,5.0);
	        assertNotEquals(8.0, actualResult);
	    }
	   
	   @Test
	    public void addString() {
	        String actualResult = obj.add("Arp","it");
	        assertEquals("Arpit", actualResult);
	    }
	   @Test
	    public void division() {
	        double actualResult = obj.division(10.0,5.0);
	        assertNotEquals(3.0, actualResult);
	    }
	   @Test
	    public void testNegative() {
	        int actualResult = obj.subtract(2, 4);
	        boolean ans = false;
	        if(actualResult>0)
	        	ans=false;
	        else if(actualResult<0)
	        	ans=true;
	        assertTrue(ans);
	    }

	   @Test
	    public void testMultiply() {
	        int actualResult = obj.multiplication(2, 4);
	        assertEquals(8,actualResult);
	    }



//	   @Test
//	    @DisplayName("Check For Null")
//	    public void testGetString() {
//	        assertNull(obj.getstring(null));
//	    }
//
//
//
//	   @Test
//	    @DisplayName("Assert throws exception")
//	    public void testString() {
//	        String str = obj.getstring(null);
//	        assertThrows(NullPointerException.class, () -> str.length());
//	   }


	   @After
	    public  void afterAllDemo() {
	        System.out.println("after all");
	    }
	   @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class");  
	    }  

}
