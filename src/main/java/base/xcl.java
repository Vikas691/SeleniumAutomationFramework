package base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//-----------Writing exccel file--------------
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("lilu");
		
		
		
		sheet.createRow(0).createCell(0).setCellValue("Name");
		sheet.getRow(0).createCell(1).setCellValue("age");
		sheet.createRow(1).createCell(0).setCellValue("Vikass");
		sheet.getRow(1).createCell(1).setCellValue(27);
		
		
		FileOutputStream fis = new FileOutputStream("C:\\Users\\vikas\\eclipse-workspace\\selenium-framework-bro\\praktice.xlsx");
		
		wb.write(fis);
		fis.close();
		wb.close();
		
		System.out.println("data written succesfuly");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	-----------------------------Reading excel file----------------------------
//		FileInputStream file = new FileInputStream("C:\\Users\\vikas\\eclipse-workspace\\selenium-framework-bro\\praktice.xlsx");
//		System.out.println("File found successfully!");
//		
//		  //  e.printStackTrace();
//	
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		XSSFSheet sheet = wb.getSheet("pillow");
//		String data = sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data);
	}

	}


