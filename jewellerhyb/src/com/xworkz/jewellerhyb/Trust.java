package com.xworkz.jewellerhyb;

public class Trust extends Purity{ //subclass3
	
	void beleive()
	{
		System.out.println("peoles also buy jewels bcs to survive thier in the difficult times ,gold or jewels plays a very importane role there");
		
	}
	public static void main(String args[])
	{
		Trust t=new Trust();
		Price p=new Price();
		t.pure();
		p.color();
		p.amount();
	}

}
