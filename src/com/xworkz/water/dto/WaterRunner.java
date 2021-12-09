package com.xworkz.water.dto;

public class WaterRunner {

	public static void main(String args[])
	{
		Water w=new Water("Color,Temperature,odor","H2O","Most used for agriculture,industry & electricity",true,"Henry Cavendish",
		"ingredients in drinking water are calcium,zinc,iron,sodium,etc");		
		
		System.out.println(w.getPhysicalProperties()+" \n"+w.getChemicalFormula()+" \n"+w.getUsedFor()+" \n"+w.getPureWater()+" \n"+w.getInventor()+" \n"+w.getIngredients());
		System.out.println();
		
		w.setPhysicalProperties("Density,taste");
		System.out.println(w.getPhysicalProperties()+" \n"+w.getChemicalFormula()+" \n"+w.getUsedFor()+" \n"+w.getPureWater()+" \n"+w.getInventor()+" \n"+w.getIngredients());
	}
}
