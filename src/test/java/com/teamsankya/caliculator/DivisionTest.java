package com.teamsankya.caliculator;

import org.junit.Test;

import junit.framework.TestCase;

public class DivisionTest {
	
	@Test
	public void div1() {
		double sum=Division.div(1.2,1);
		TestCase.assertEquals(1.2, sum);
		
	}
	

}
