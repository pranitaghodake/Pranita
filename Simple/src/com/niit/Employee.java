package com.niit;

public class Employee {
	
	int eid;
	String ename;
	double esalary;
	
	public Employee(int eid){
		this.eid=eid;
	}
	
	public Employee(String ename){
		this.ename=ename;	
	}
	
	public Employee(double esalary){
		this.esalary=esalary;
	}
	
	public int printEid(){
		System.out.println(eid);
		return eid;
	}
	public String printEname(){
		System.out.println(ename);
		return ename;
	}
	
	public double printEsalary(){
		System.out.println(esalary);
		return esalary;
	}
	
}