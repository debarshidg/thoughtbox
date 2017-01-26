package com.java8poc;

//1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
public class Fibonacci {
	
	static int a=1, b=1,n=10;
	
	public static void main(String args[]){
		int a = 1;
		int b = 1;
		/*int temp = 0 ;
		System.out.println( a + "\n" + b);
		for(int i=3; i<=10; i++){
			temp = a;
			a = a + b;
			b = temp;
			System.out.println(a);
		}*/
		
		a = 1;
		b = 1;
		System.out.println( a + "\n" + b);
		Fibonacci.recursiveFibonacci(n-2);
	}
	
	public static void recursiveFibonacci(int count){
		int temp = a;
		a= a+b;
		b=temp;
		if(count>0){
			System.out.println(a);
			Fibonacci.recursiveFibonacci(count-1);
		}
	}
}
