package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.LoginBean_Registration_ELTC063;
import com.training.dao.ELearningDAO;
import com.training.dao.ELearningDAO_Registration_ELTC_063;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders_Registration_ELTC063 {

	@DataProvider(name = "db-inputs")
	//To take value from database.
	public Object [][] getDBData() {

		List<LoginBean_Registration_ELTC063> list = new ELearningDAO_Registration_ELTC_063().getLogins();
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean_Registration_ELTC063 temp : list){
			Object[]  obj = new Object[6]; 
			obj[0] = temp.getfirstname();
			obj[1] = temp.getlastname();
			obj[2] = temp.getemail();
			obj[3] = temp.getusername();
			obj[4] = temp.getpassword();
			obj[5] = temp.getconfpassword();
			
			result[count ++] = obj; 
		}
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:\\IBM_Selenium WD\\ELTD\\ELTD_Excel_Data.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	/*@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}*/
}
