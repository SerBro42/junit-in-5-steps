package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void Should_ReturnTrue_WhenArrayContainsAWS() {
		var test = todos.contains("AWS");
		
		//assertion methods have the option to add a custom error message as their second parameter
		assertTrue(test, "Doesn't contain AWS");
	}
	
	@Test
	void Should_ReturnTrue_WhenArrayLengthIs3() {
		assertEquals(3, todos.size());

	}
	
	@Test
	void Should_ReturnFalse_WhenTestedForGCP() {
		var test = todos.contains("GCP");
		
		assertFalse(test, "Array contains GCP");
	}
	
	@Test
	void Should_ReturnTrue_WhenTwoArraysAreEqual() {
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		
		//Fails the test. Returns an error message saying exactly where the difference is
		//assertArrayEquals(new int[] {1,2}, new int[] {2,1});
	}

}
