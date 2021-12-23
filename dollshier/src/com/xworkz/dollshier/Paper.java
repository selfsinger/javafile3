package com.xworkz.dollshier;

public class Paper extends Dolls{ //subclass2
	
	void sheets()
	{
		System.out.println("2.We can do hand doll using papers,we can also see different kinds of dolls");
	}
	public static void main(String args[])
	{
		Paper p=new Paper();
		Childdoll ch=new Childdoll();
		ch.like();
		ch.barbie();
		p.like();
		p.sheets();
		
	}
}
