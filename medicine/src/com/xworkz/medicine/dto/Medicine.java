package com.xworkz.medicine.dto;

public class Medicine {

	private String purpose,typeofdisease,name;
	double price;
	
	public Medicine(String purpose,String typeofdisease,String name,double price)
	{
		this.purpose=purpose;
		this.typeofdisease=typeofdisease;
		this.name=name;
		this.price=price;
	}
	public String getPurpose()
	{
		return purpose;
	}
	
	public String getTypeOfDisease()
	{
		return typeofdisease;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPurpose(String purpose)
	{
		this.purpose=purpose;
	}
	public void setTypeOfDisease(String typeofdisease)
	{
		this.typeofdisease=typeofdisease;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	}

	

