package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	//Absence of failure is success
	//Test condition or assert
	
	@Test
	void test() {
		
		int[] numbers = {1,2,3};
		
		var math = new MyMath();
		int result = math.calculateSum(numbers);
		int expectedResult = 6;
		assertEquals(expectedResult, result);
		System.out.println(result);
	}

}
