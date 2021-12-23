package com.xworkz.camerahier;

public class Caps extends Camera{ //subclass 2
	
	int price=10000;
	void type3()
	{
		System.out.println("here,the third type of camera:");
	}
	void present()
	{
		System.out.println("3.Instant Camera");
		System.out.println("Price of the camera is:"+price);
	}
	public static void main(String args[])
	{
		Lense l=new Lense();
		Caps c=new Caps();
		l.type1();
		l.disp();
		l.type2();
		l.show();
		c.type3();
		c.present();
	}

}
