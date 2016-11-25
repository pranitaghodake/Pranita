package com.niit.practice;

import java.util.HashMap;

public class Occ {

	public static void main(String[] args) {
		
		String str="PRANITA";
		HashMap<Character, Integer>map=new HashMap<>();
		for(char ch:str.toCharArray()){
			if(map.containsKey(ch)){
				int val=map.get(ch);
				map.put(ch, val+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);

	}

}
