package com.xworkz.water.dto;

public class Water {

	private String physicalProperties,chemicalFormula,usedFor,inventor,ingredients;
	boolean pureWater;
	
	public Water(String physicalProperties, String chemicalFormula, String purpose, boolean pureWater,String inventor,String ingredients) {
		super();
		this.physicalProperties = physicalProperties;
		this.chemicalFormula = chemicalFormula;
		this.usedFor = purpose;
		this.pureWater = pureWater;
		this.inventor=inventor;
		this.ingredients=ingredients;
		
	
	}

	public String getPhysicalProperties() 
	{
		return physicalProperties;
	}

	public void setPhysicalProperties(String physicalProperties) 
	{
		this.physicalProperties = physicalProperties;
	}

	public String getChemicalFormula() 
	{
		return chemicalFormula;
	}

	public void setChemicalFormula(String chemicalFormula) 
	{
		this.chemicalFormula = chemicalFormula;
	}

	public String getUsedFor() 
	{
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	
	public boolean getPureWater() 
	{
		return pureWater;
	}

	public void setPureWater(boolean pureWater) 
	{
		this.pureWater = pureWater;
	}

	public String getInventor() {
		return inventor;
	}

	public void setInventor(String inventor) {
		this.inventor = inventor;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	
	
	
	
	
}
