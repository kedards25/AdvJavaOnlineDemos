package com.learning.services;

import java.sql.*;
import java.util.*;

import com.learning.models.DemoModel;

public class DemoServiceImpl implements DemoService {

	String user="sa";
	String pwd="";
	String url="jdbc:h2:tcp://localhost/~/test";
	
	Connection conn=null;
	Statement statement;
	PreparedStatement preparedStatement;
	DemoModel model;
	ResultSet rs;
	
	public boolean createConnection()
	{
		try {
			Class.forName("org.h2.Driver");
			conn=DriverManager.getConnection(url, user, pwd);
			if(conn!=null)
			{
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
				
	}
	
	@Override
	public List<DemoModel> getModelData() {
		List<DemoModel> modelList=new ArrayList<DemoModel>();
		if(createConnection())
		{
			String query="select * from userModel";
			try {
				statement=conn.createStatement();
				rs=statement.executeQuery(query);
				while (rs.next()) {
					int id=rs.getInt("id");
					String name=rs.getString("Name");
					String pass=rs.getString("pwd");
					model=new DemoModel(id, name, pass);
					modelList.add(model);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return modelList;
	}

}
