package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean_Registration_ELTC063;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

// Data Access Object 
public class ELearningDAO_Registration_ELTC_063 {
	
	Properties properties; 
	
	public ELearningDAO_Registration_ELTC_063() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<LoginBean_Registration_ELTC063> getLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		GetConnection gc  = new GetConnection(); 
		List<LoginBean_Registration_ELTC063> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<LoginBean_Registration_ELTC063>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			   //will take vlues from application
				LoginBean_Registration_ELTC063 temp = new LoginBean_Registration_ELTC063(); 
				temp.setfirstname(gc.rs1.getString(1));
				temp.setlastname(gc.rs1.getString(2));
				temp.setemail(gc.rs1.getString(3));
				temp.setusername(gc.rs1.getString(4));
				temp.setpassword(gc.rs1.getString(5));
				temp.setconfpassword(gc.rs1.getString(6));
				
				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new ELearningDAO_Registration_ELTC_063().getLogins().forEach(System.out :: println);
	}
	
	
}
