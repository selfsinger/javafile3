package com.xworkz.shop.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO implements Serializable{
	
	private Integer id;
	private String name;
	private String type;
	private String address;
	private Long contactNo;
	private String website;
	private String ownerName;
	private Long turnOver;
	private Long profit;
	

}
