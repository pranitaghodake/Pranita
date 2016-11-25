package com.niit;

import java.util.LinkedList;

public class LinkedListSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList a=new LinkedList();
//add elements in list		
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.addLast("Z");
		a.addFirst("12");
		a.add(1, "A2");
        System.out.println("orignal list is:" + a);   

            
//remove elements from list
       
	a.remove("B");
	a.remove("12");
	System.out.println("list after removing elements:" + a);
	}	
	
}
