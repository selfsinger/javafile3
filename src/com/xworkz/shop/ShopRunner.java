package com.xworkz.shop;

import com.xworkz.shop.dao.*;
import com.xworkz.shop.dto.ShopDTO;

public class ShopRunner {

	public static void main(String[] args) {
		
		ShopDTO shopDTO=new ShopDTO(1,"coffee day","restaurant","Jai Nagar",99005765876L,"www.cfdy.com","Megha",1000L,-250L);

		ShopDAO dao=new ShopDAOImpl();
		dao.save(shopDTO);
	}
}
