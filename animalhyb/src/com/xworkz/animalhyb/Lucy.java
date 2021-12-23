package com.xworkz.animalhyb;

public class Lucy extends Cat{ //subclass 3
	
	void  name()
	{
		System.out.println("Lucy is a name of the cat and its drink milk");
	}
	public static void main(String args[])
	{
		Lucy l=new Lucy();
		Wild w=new Wild();
		w.grass();
		w.jirafe();
		w.lion();
		
		l.sound();
		l.name();
	}

}
