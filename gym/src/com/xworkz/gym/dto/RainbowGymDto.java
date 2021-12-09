package com.xworkz.gym.dto;

public class RainbowGymDto {

	private int gymId,custId,noOfDumbals,noOfFlexbench;
	private String branchName,vender;
	
	public RainbowGymDto(int gymId, int custId, int noOfDumbals, int noOfFlexbench, String branchName, String vender) {
		super();
		this.gymId = gymId;
		this.custId = custId;
		this.noOfDumbals = noOfDumbals;
		this.noOfFlexbench = noOfFlexbench;
		this.branchName = branchName;
		this.vender = vender;
	}

	public int getGymId() {
		return gymId;
	}

	public void setGymId(int gymId) {
		this.gymId = gymId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getNoOfDumbals() {
		return noOfDumbals;
	}

	public void setNoOfDumbals(int noOfDumbals) {
		this.noOfDumbals = noOfDumbals;
	}

	public int getNoOfFlexbench() {
		return noOfFlexbench;
	}

	public void setNoOfFlexbench(int noOfFlexbench) {
		this.noOfFlexbench = noOfFlexbench;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}
	
	
	}
	
		
	
	
