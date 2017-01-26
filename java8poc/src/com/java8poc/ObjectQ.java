package com.java8poc;

public class ObjectQ {
	public void assign(Object o){
		o = null;
	}
	public static void main(String args[]){
		ObjectQ obj = new ObjectQ();
		Object o = new Object();
		System.out.println("Object O " + o);
		obj.assign(o);
		System.out.println("Object Obj " + obj);
		
		
	}
}

//Object O java.lang.Object@7852e922
//Object Obj com.java8poc.ObjectQ@4e25154f
