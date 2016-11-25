package com.niit.practicedemo;

public class SecondLargestNumber {
	
	public static void main(String a[]){
		
		int num[]={55,78,25,48,96,11};
		int hignum=0;
		int s_hignum=0;
		
		for(int n:num){
			if(hignum<n){
				s_hignum=hignum;
				hignum=n;
						
			}else if(s_hignum<n){
				s_hignum=n;
			}
		}
		System.out.println("largest number is:" + hignum);
		System.out.println("second largest number is" + s_hignum);
	}
	

}
