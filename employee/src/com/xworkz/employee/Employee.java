package com.xworkz.employee;

public class Employee {
 
	int id;
	String name,type;
	long phone;
	
	public Employee(int id,String name,String type,long phone)
	{
		this.id=id;
		this.name=name;
		this.type=type;
		this.phone=phone;
		System.out.println(id);
		System.out.println(name);
		System.out.println(type);
		System.out.println(phone);
	
	}
	public void employee(int id,String name,String type,long phone)
	{
		System.out.println();
		System.out.println(id);
		System.out.println(name);
		System.out.println(type);
		System.out.println(phone);
		System.out.println();
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.phone);
		
		
		
	}
}
