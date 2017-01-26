package com.java8poc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
	public static void main(String args[]) throws IOException{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    int num = Integer.parseInt(reader.readLine());
	    int c=0;
	    for(int i=2; i<=num/2;i++){
	    	if(num%i==0){
	    		c++;
	    	}
	    }
	    if(c==0){
	    	System.out.println("Number is prime : " + num);
	    }
	}
}
