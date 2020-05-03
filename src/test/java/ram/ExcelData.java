package ram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
XSSFSheet sheet1;
File src;
XSSFWorkbook wb;
	
	
	public ExcelData(String ExcelData) throws IOException{
	

		src=new File(ExcelData);
		FileInputStream fs=new 	FileInputStream(src);
		wb=new XSSFWorkbook(fs);
		
		sheet1=wb.getSheetAt(0);
		

	}
	public String getData(int sheetnumber, int rownum,int colnum)
	{
		String data1=sheet1.getRow(rownum).getCell(colnum).getStringCellValue();
	return data1;
	}
	public void writeData(int rownum,int colnum,String Value) throws IOException
	{
		
		sheet1.getRow(rownum).createCell(colnum).setCellValue(Value);
		FileOutputStream fout=new FileOutputStream (src);
		wb.write(fout);
		
	}
	
	
	
		
	
		
	}


