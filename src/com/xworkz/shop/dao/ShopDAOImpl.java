package com.xworkz.shop.dao;

import java.sql.*;

import static com.xworkz.shop.constants.ResultSqlProperties.*;
import com.xworkz.shop.dto.ShopDTO;

public class ShopDAOImpl implements ShopDAO {

	@Override
	public boolean save(ShopDTO dto) {
		System.out.println("saving".concat(dto.toString()));
		
		String insertQuery="insert into Shop_Details values("+dto.getId()+",'"+dto.getName()+"','"+dto.getType()+"','"+dto.getAddress()+"',"+dto.getContactNo()+",'"+dto.getWebsite()+"','"+dto.getOwnerName()+"',"+dto.getTurnOver()+","+dto.getProfit()+")";
		try(Connection con=DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),PASSWORD.getValue());
				Statement st=con.createStatement()){
				
				int rowsAffected=st.executeUpdate(insertQuery);
				return (rowsAffected==1)?true : false;
		
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;


	}
}
