package test.com.bhavna.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import main.com.bhavna.service.Operation;

public class TestJunit {
	@Test
	public void test() {
		System.out.println("in test");
	}
	
	
	@Test
	public void testCheckName() {
		Operation obj=new Operation();
		assertEquals(30,obj.addition(10,20));
	}
	@Test
	public void testName() {
		Operation obj=new Operation();
		assertNull(obj.nameCheck("Ram"));
		assertNotNull("HCL");
	}
	@Test
	@DisplayName(value="Testing")
	public void testCheckEquals() {
		assertNotEquals(20,10);
	}
	@Test
	public void testWithOutLogicalCall() {
		assertTrue(10>5);
		assertFalse(10>20);
	}
	@BeforeEach
	public void display() {
		System.out.println("Displaying before each");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Displaying before all");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("Displaying After Each");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("displaying  After all");
	}

}
