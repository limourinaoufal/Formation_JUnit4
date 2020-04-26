package com.lndroid.tp.junit.logic;

public class Calculation {
	
	public static int finMax(int...args){
		int max = 0;
		if(args.length > 0)
			 max = args[0];
		
		for(int i = 1;i<args.length;i++){
			if(max<args[i])
				max = args[i];
		}
		return max;
	}
	
	public static int cube(int n){
		return n*n*n;
	}
	
	public static String reverseWord(String str){
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
	}
	
	

}
