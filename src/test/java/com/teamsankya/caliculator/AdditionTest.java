package com.teamsankya.caliculator;

import org.junit.Test;
import junit.framework.TestCase;

public class AdditionTest {
	
	@Test
	public void adds1() {
		int sum=Add.add(5,78);
		TestCase.assertEquals(84, sum);
		
	}
	
}
