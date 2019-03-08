package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead_complex;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders_complex {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[2]; 
			obj[0] = temp.getUserName(); 
			obj[1] = temp.getPassword(); 
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
		String fileName = "C:\\IBM_Selenium WD\\ELTD\\ELTD_Excel_Data.xlsx"; 
		String SheetName="ELTC_061";
		return new ApachePOIExcelRead_complex().getExcelContent(fileName,SheetName); 
	}
	
	@DataProvider(name = "excel-inputs2")
	public Object[][] getExcelData2(){
		String fileName = "C:\\IBM_Selenium WD\\ELTD\\ELTD_Excel_Data.xlsx";
		String SheetName="ELTC_062";
		return new ApachePOIExcelRead_complex().getExcelContent(fileName,SheetName); 
	}
	
	@DataProvider(name = "excel-inputs3")
	public Object[][] getExcelData3(){
		String fileName = "C:\\IBM_Selenium WD\\ELTD\\ELTD_Excel_Data.xlsx"; 
		String SheetName="ELTC_065";
		return new ApachePOIExcelRead_complex().getExcelContent(fileName,SheetName); 
	}
	
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}



