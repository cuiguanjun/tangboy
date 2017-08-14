package com.glen.he;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexCalculationTest {
	
	ComplexCalculation cc = new ComplexCalculation();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDivision() {
		int c = cc.Division(100, 5);
        assertEquals(20, c);  
	}

	@Test
	public void testMultiply() {
		int c = cc.Multiply(100, 5);
		assertEquals(500, c);
        
	}

}
