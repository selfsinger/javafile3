package com.xworkz.medicine.dto;

public class MedicineRunner {

	public static void main(String args[])
	{
		Medicine m=new Medicine("to provide medication to disease","viralfever","acetaminophen",7);
		System.out.println(m.getPurpose());
		System.out.println(m.getTypeOfDisease());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
        m.setPurpose("to reduce fever soonly");
		m.setTypeOfDisease("fever");
		m.setName("dolo 650");
		m.setPrice(20);
		System.out.println();
		System.out.println(m.getPurpose());
		System.out.println(m.getTypeOfDisease());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
			
	}
}
