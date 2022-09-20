package com.casestudy.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.casestudy.bean.ReferralTo;

class Testing {
	@Test
	public void test(){
		System.out.println("Working");
	}
	@ParameterizedTest
	@CsvFileSource(resources="D://av/referals.txt")
	@DisplayName("Evenodd valueFileCsv source")
	public void checkCsvFileSource(int num,boolean val) {
		ReferralTo obj=new ReferralTo(null, null, null);
		System.out.println("num="+num);
		assertEquals(val,obj.nameCheck(null));
	}
	
	@Test
    @DisplayName("Assert throws exception")
    public void testString() {
		ReferralTo obj=new ReferralTo(null, null, null);
        String str = obj.nameCheck(null);
        assertThrows(NullPointerException.class, () -> str.length());
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
