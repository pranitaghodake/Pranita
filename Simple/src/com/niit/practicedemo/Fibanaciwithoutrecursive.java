package com.niit.practicedemo;

public class Fibanaciwithoutrecursive {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=100;i++){
			int sum=a+b;
			
			if(sum<=100){
				a=b;
				b=sum;
				System.out.println(sum);
			}
		}
		
		

	}

}
