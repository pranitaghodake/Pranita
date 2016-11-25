package com.niit.practicedemo;

public class SecondSmallestNumber {

	
			
		public static void main(String a[]){
			
			int num[]={55,78,25,48,96,11};
			int hignum=96;
			int s_hignum=78;
			
			for(int n:num){
				if(hignum>n){
					s_hignum=hignum;
					hignum=n;
							
				}else if(s_hignum>n){
					s_hignum=n;
				}
			}
			System.out.println("smallest number is:" + hignum);
			System.out.println("second smallest number is" + s_hignum);
		}
		

	}


