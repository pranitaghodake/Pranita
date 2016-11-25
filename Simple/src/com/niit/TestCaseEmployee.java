package com.niit;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseEmployee {
	
	
	int eid=101;
	String ename="PRANITA";
	double esalary=20000;
	
	Employee e1=new Employee(eid);
	/*Employee e2=new Employee(ename);
	Employee e3=new Employee(esalary);
	*/
	@Test
	public void testprinteid(){
		assertEquals(e1,e1.printEid());
	}
	
	/*@Test
	public void testprintename(){
		assertEquals(e2,e2.printEname());
		
	}
	*//*@Test
	public void testprintesalary(){
		assertEquals(e3,e3.printEsalary());
		
	}
	*/
	
	
	
}