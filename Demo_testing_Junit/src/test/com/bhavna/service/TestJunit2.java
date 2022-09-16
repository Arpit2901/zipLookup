package test.com.bhavna.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.com.bhavna.service.ArrayIndexOutOfBoundException;
import main.com.bhavna.service.MyArray;
import main.com.bhavna.service.Operation;

public class TestJunit2 {
	@Test
	public void test(){
		System.out.println("Working");
	}
	@Test
	@DisplayName("checkArray")
	public void testGetString() {
		MyArray obj =new MyArray();
		int num1[]= {10,20,30};
		int num2[]=obj.getArray();
		assertArrayEquals(num1,num2);
	}
	
//	@Test
//	@DisplayName("CheckException")
//	public void testException() {
//		assertThrows(ArrayIndexOutOfBoundException.class,()->MyArray.throwingException());
//	}
	
	@Test
    @DisplayName("Assert throws exception")
    public void testString() {
		Operation obj=new Operation();
        String str = obj.nameCheck(null);
        assertThrows(NullPointerException.class, () -> str.length());
    }
	@ParameterizedTest
	@ValueSource(ints= {10,23,30,35})
	@DisplayName("Evenodd value source")
	public void CheckValueSource(int num) {
		Operation obj=new Operation();
		System.out.println("num="+num);
		assertEquals(true,obj.check(num));
	}
	@ParameterizedTest
	@CsvSource({"10,true","15,false","30,true","35,false"})
	@DisplayName("Evenodd valueCsv source")
	public void checkCsvSource(int num,boolean val) {
		Operation obj=new Operation();
		System.out.println("num="+num);
		System.out.println(obj.check(num));
		assertEquals(val,obj.check(num));
	}
	@ParameterizedTest
	@CsvFileSource(resources="/demo.csv")
	@DisplayName("Evenodd valueFileCsv source")
	public void checkCsvFileSource(int num,boolean val) {
		Operation obj=new Operation();
		System.out.println("num="+num);
		assertEquals(val,obj.check(num));
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
