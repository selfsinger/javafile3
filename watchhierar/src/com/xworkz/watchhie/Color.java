package com.xworkz.watchhie;

public class Color extends Watch {
	 
	void col()
	{
		System.out.println("we can see different colors in watches");
	}
	public static void main(String args[])
	{
		Time t=new Time();
		Color c=new Color();
		t.fun();
		t.disp();
		t.fun1();
		c.col();
	}

}
