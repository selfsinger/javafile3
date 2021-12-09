package com.xworkz.boll.dto;

public class BollDto {

	private String type;
	private String color;
	private String creators;
	private int size;
    private boolean joything;
    
    public BollDto(String type,String color,String creators,int size,boolean joything)
    {
    	
    	this.type=type;
    	this.color=color;
    	this.creators=creators;
    	this.size=size;
    	this.joything=joything;
    }
    
	
	public String getType()
    {
    	return type;
    }
    public String getColor()
    {
    	return color;
    }
    public String getCreators()
    {
    	return creators;
    }
    public int getSize()
    {
    	return size;
    }
    public boolean getJoything()
    {
    	return joything;
    }
    public void setType(String type)
    {
    	this.type=type;
    }
    public void setColor(String color)
    {
    	this.color=color;
    }
    public void setCreators(String creators)
    {
    	this.creators=creators;
    }
    public void setSize(int size)
    {
    	this.size=size;
    }
    public void setJoything(boolean joything)
    {
    	this.joything=joything;
    }
    
    }
	

