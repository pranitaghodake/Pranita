package com.niit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	
	String message="HELLO WORLD";
	MessageUtil messageUtil=new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		assertEquals(message,messageUtil.printMessage());
		
	}
	

}
