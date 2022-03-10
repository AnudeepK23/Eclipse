package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {

	@Test
	public void testAssert() {
		String str = new String("Well");
		String str1 = new String("Well");
		String str2 = null;
		String str3 = "Done";
		String str4 = "Done";
		int val = 5;
		int val1 = 6;
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		assertEquals(str,str1);
		//check for true
		assertTrue(val<val1);
		//check for false
		assertFalse(val>val1);
		//check for null
		assertNotNull(str);
		//check it is null
		assertNull(str2);
		//check if the reference is to the same object
		assertSame(str3, str4);
		//not same
		assertNotSame(str, str1);
		assertArrayEquals(expectedArray, resultArray);
				
	}
}
