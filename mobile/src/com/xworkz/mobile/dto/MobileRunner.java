package com.xworkz.mobile.dto;

public class MobileRunner {

	public static void main(String args[])
	{
		Mobile m=new Mobile("realme","u1",6,128,"1258fgd82");
		System.out.println(m.getBrand());
		System.out.println(m.getModelName());
		System.out.println(m.getRam());
		System.out.println(m.getMemory());
		System.out.println(m.getImeNumber());
		m.setBrand("IPhone");
		m.setModelName("iphone 3 pro");
		m.setRam(24);
		m.setMemory(164);
		m.setImeNumber("4536hfgr67");
		System.out.println();
		System.out.println(m.getBrand());
		System.out.println(m.getModelName());
		System.out.println(m.getRam());
		System.out.println(m.getMemory());
		System.out.println(m.getImeNumber());
		
		
	}
}
