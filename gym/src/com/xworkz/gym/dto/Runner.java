package com.xworkz.gym.dto;

public class Runner {

	public static void main(String args[])
	{
		RainbowGymDto dto=new RainbowGymDto(001,314,200,15,"BTM","fitnessFirst");
		RainbowGymDto dto1=new RainbowGymDto(002,315,150,16,"jaynagar","fitnessFirst");
		System.out.println(dto.getGymId());
		System.out.println(dto.getCustId());
		System.out.println(dto.getNoOfDumbals());
		System.out.println(dto.getNoOfFlexbench());
		System.out.println(dto.getBranchName());
		System.out.println(dto.getVender());
		System.out.println();
		System.out.println(dto1.getGymId());
		System.out.println(dto1.getCustId());
		System.out.println(dto1.getNoOfDumbals());
		System.out.println(dto1.getNoOfFlexbench());
		System.out.println(dto1.getBranchName());
		System.out.println(dto1.getVender());
		System.out.println();
		
		dto.setGymId(3);
		System.out.println(dto.getGymId());
		System.out.println(dto.getCustId());
		System.out.println(dto.getNoOfDumbals());
		System.out.println(dto.getNoOfFlexbench());
		System.out.println(dto.getBranchName());
		System.out.println(dto.getVender());
		System.out.println();
		
		dto1.setGymId(4);
		System.out.println(dto1.getGymId());
		System.out.println(dto1.getCustId());
		System.out.println(dto1.getNoOfDumbals());
		System.out.println(dto1.getNoOfFlexbench());
		System.out.println(dto1.getBranchName());
		System.out.println(dto1.getVender());
		
		
		
	}
}
