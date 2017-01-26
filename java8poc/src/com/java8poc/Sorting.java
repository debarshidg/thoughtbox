package com.java8poc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
	String name;
	int roll;
	Employee(String nameV, int rollV){
		name = nameV;
		roll = rollV;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(roll==o.getRoll()){
			return 0;
		}else if(roll > o.getRoll()){
			return 1;
		}else{
			return -1;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
}

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class Sorting {
	public static void main(String args[]){
		List<String> empNames = new ArrayList<String>();
		empNames.add("abc");
		empNames.add("def");
		empNames.add("aghi");
		Collections.sort(empNames);
		Iterator<String> empListItr = empNames.iterator();
		while(empListItr.hasNext()){
			System.out.println(empListItr.next());
		}
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("123",1));
		empList.add(new Employee("456",2));
		empList.add(new Employee("123",3));
		Collections.sort(empList, Collections.reverseOrder());
		Iterator<Employee> empLItr = empList.iterator();
		while(empLItr.hasNext()){
			System.out.println(empLItr.next().getRoll());
		}
		
		Collections.sort(empList,new NameComparator());
		
		empLItr = empList.iterator();
		while(empLItr.hasNext()){
			System.out.println(empLItr.next().getRoll());
		}
	}
}
