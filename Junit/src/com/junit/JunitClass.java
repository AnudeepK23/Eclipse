package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JunitClass {
	
	@Test
	public void setUp() {
		String str = "This is Junit file";
		assertEquals("This is Junit file", str);
	}

}
