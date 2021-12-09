package com.xworkz.boll.dto;

public class BollDtoRunner {
	public static void main(String args[])
	{

	BollDto b=new BollDto("basketball","red","Africans",3,true);
	BollDto b2=new BollDto("vollyboll","white","Africans",4,true);
	System.out.println(b.getType()+" "+b.getColor()+" "+b.getCreators()+" "+b.getSize()+" "+b.getJoything());
	System.out.println(b2.getType()+" "+b2.getColor()+" "+b2.getCreators()+" "+b2.getSize()+" "+b2.getJoything());
	b.setType("throwball");
	b2.setColor("black");
	System.out.println(b.getType()+" "+b.getColor()+" "+b.getCreators()+" "+b.getSize()+" "+b.getJoything());
	System.out.println(b2.getType()+" "+b2.getColor()+" "+b2.getCreators()+" "+b2.getSize()+" "+b2.getJoything());
	}
}
