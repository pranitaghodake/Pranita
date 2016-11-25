package com.niit.practicedemo;

public class IsPerfectNumber {

	public boolean isPerfectNumber(int number){
		int temp=0;
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				temp+=i;
			}
			}
			if(temp==number){
				System.out.println("the number is perfect");
				return true;
			}else{
				System.out.println("number is not perfect");
				return false;
			}
				
		}
		
		public static void main(String a[]) {
			IsPerfectNumber nr=new IsPerfectNumber();
			System.out.println("Is Perfect Number:" + nr.isPerfectNumber(6));
			
		}
		
	}


