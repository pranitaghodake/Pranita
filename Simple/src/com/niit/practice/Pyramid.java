package com.niit.practice;

public class Pyramid {

	public static void main(String[] args) {
		
		int num=10;
		
		for(int i=1;i<=num;i++){
			
			for(int j=1;j<=num-1;j++){
				System.out.println("");
			}
			
			for(int k=1;k<=i;k++){
				System.out.println(""+k+"");
			}
			
			for(int l=i-1; l>0;l--){
				System.out.println(""+l+"");
			}
			System.out.println("");
		
		}		
		
	}
	}


