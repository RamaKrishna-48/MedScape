package automation.pages;

import java.util.ArrayList;

import com.crm.qa.util.Xls_Reader;

public class TestUtility {
	
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
     ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
			reader=new Xls_Reader("C:\\Users\\devi\\Desktop\\java\\selenium\\eclipse-epsilon-1.5-win32\\eclipse\\workspace\\CRM\\src\\main\\java\\automation\\pages\\automation.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
     for(int rowNum = 2; rowNum <= reader.getRowCount("sheet1"); rowNum++) {	
			
			/*ArrayList<Object[]> myData=new ArrayList<Object[]>();
			Xls_Reader reader = new Xls_Reader("C:\\\\Users\\\\devi\\\\Desktop\\\\java\\\\selenium\\\\eclipse-epsilon-1.5-win32\\\\eclipse\\\\workspace\\\\CRM\\\\ExcellSheets\\\\automation.xlsx");
			int rowCount = reader.getRowCount("sheet1");
			reader.addColumn("sheet1", "Status");
			
			for(int rowNum = 2; rowNum<=5; rowNum++) {
				System.out.println("=====");*/
			
			String firstname=reader.getCellData("sheet1", "firstname", rowNum);
			String lastname=reader.getCellData("sheet1", "lastname", rowNum);
			String address=reader.getCellData("sheet1", "address", rowNum);
			String email=reader.getCellData("sheet1", "email", rowNum);
			String phone=reader.getCellData("sheet1", "phone", rowNum);
			String skill=reader.getCellData("sheet1", "skill", rowNum);
			String count=reader.getCellData("sheet1", "count", rowNum);
			String year=reader.getCellData("sheet1", "year", rowNum);
			String month=reader.getCellData("sheet1", "month", rowNum);
			String day=reader.getCellData("sheet1", "day", rowNum);
			String fp=reader.getCellData("sheet1", "fp", rowNum);
			String lp=reader.getCellData("sheet1", "lp", rowNum);
			
			Object ob[]= {firstname, lastname, address, email, phone, skill, count, year, month, day, fp, lp};
			myData.add(ob);
		}
	return myData;
	}
}
