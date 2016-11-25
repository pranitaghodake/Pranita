package com.niit;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	
	
	   static void push(Stack st, int a) {
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   static void pop(Stack st) {
	      System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	   }

	   public static void main(String args[]) {
	      Stack st = new Stack();
	      System.out.println("stack: " + st);
	      push(st, 42);
	      push(st, 66);
	      push(st, 99);
	      pop(st);
	      pop(st);
	      pop(st);
	      try {
	         pop(st);
	      }catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }
	   }
	}


