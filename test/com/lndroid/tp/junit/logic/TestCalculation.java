package com.lndroid.tp.junit.logic;

import static org.junit.Assert.*;

import javax.sound.sampled.ReverbType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculation {
	
	@BeforeClass
	public static void setBeforClass(){
		System.out.println("#before Class : @BeforeClass");
	}
	
	@Before
	public void setBeforTestMethod(){
		System.out.println("\t ##before Test Methode : @@Before");
	}
	
	@Test
	public void testFindMax(){
		System.out.println("TEST CASE MAX");
		assertEquals(4, Calculation.finMax(1,2,4,3));
		assertEquals(-1, Calculation.finMax(-1,-2,-4,-3));
		assertEquals(0, Calculation.finMax());
		
		
	}
	
	@Test
	public void testCube(){
		System.out.println("TEST CASE CUBE");
		assertEquals(27, Calculation.cube(3));
		assertNotEquals(9, Calculation.cube(3));
		assertNotNull(Calculation.cube(0));
		assertNull(null);
		assertTrue(Calculation.cube(0) == 0);
		assertFalse(Calculation.cube(0) == 1);
		assertSame(Calculation.cube(3),27);
		assertNotSame(Calculation.cube(3),28);
		fail("BREAK POINT FAIL HERE Complete the 2 assert below ;) ");
		//assertThat()
		//assertArrayEquals(Calculation.cube(0) == 0 , Calculation.cube(0) != 1)
	}
	
	@Test
	public void testReverseWord(){
		System.out.println("TEST CASe REVERSE WORD");
		assertEquals("CBA", Calculation.reverseWord("ABC"));
	}
	
	
	
	@After
	public void setAfterTestMethod(){
		System.out.println("\t ##After Test Methode : @After");
	}
	
	@AfterClass
	public static void setAfterClass(){
		System.out.println("#AfterClass Class : @AfterClass");
	}

}
