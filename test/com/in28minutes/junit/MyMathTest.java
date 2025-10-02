package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	//Absence of failure is success
	//Test condition or assert
	
	private MyMath math = new MyMath();

	
	@Test
	void test_ShouldReturn6() {
		
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
		System.out.println(math.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void test_ShouldReturnZero_whenArrayLengthIsZero() {
		
		assertEquals(0, math.calculateSum(new int[] {}));
		System.out.println(math.calculateSum(new int[] {}));
	}

}
