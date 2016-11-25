package com.niit;

import java.util.EmptyStackException;
import java.util.Stack;


public class Simple {
	
	static void push(Stack st,int a){
	      st.push(new Integer(a));
		System.out.println("push("+ a +")");
		System.out.println("stack:" +st);
	}
	
	static void pop(Stack st){
		System.out.println("pop->");
		Integer a= (Integer)st.pop();
		System.out.println(a);
		System.out.println("stack:"+st);
		
	}
	
	public static void main(String args[]){
		Stack st=new Stack();
		push(st,97);
		push(st,93);
		push(st,23);
		pop(st);
		pop(st);
		pop(st);
		try {
			pop(st);
			
		} catch (EmptyStackException e) {
			System.out.println("stack is empty");
			// TODO: handle exception
		}
	
	}

}
