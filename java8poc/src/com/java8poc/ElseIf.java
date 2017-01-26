package com.java8poc;

public class ElseIf {
	public static void main(String args[]){
		int a=1,b=2,c=3;
		if(a>b && a>c){
			System.out.println("a" + a);
		}else if(b>c ){
			System.out.println("b" + b);
		}else{
			System.out.println("c" + c);
		}
		
		char chr='a';
		int chrI = Character.getNumericValue(chr);
		System.out.println("chrI " + chrI);
		
	}
}
