package com.niit.practice;

public class Palindrome {

	
	public static void main(String args[]){
		
	
	int num=121;
	int sum=0;
	int rem=0;
	int temp;
	
	temp=num;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		sum=(sum*10)+rem;
		
	}
	if(temp==sum){
		System.out.println("Palindrome number");
	}else
		System.out.println("Not Palindrome");
	
	}
}
