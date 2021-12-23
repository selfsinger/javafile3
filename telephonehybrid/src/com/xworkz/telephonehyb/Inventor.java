package com.xworkz.telephonehyb;

public class Inventor extends Telephone1{
	
	// Example for Hybrid inheritance
	void invent()
	{
		System.out.println("Telephone is invented by telephone");
	}
	public static void main(String[] args)
	{
		Inventor in=new Inventor();
		Kinds kin=new Kinds();
		Wire w=new Wire();
		Buttons b=new Buttons();
		in.function();
		w.function();
		b.function();
		in.invent();
		kin.fun();
	}

}
