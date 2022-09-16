package demo2.com.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {

	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	public void test(){
		System.out.println("done");
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
