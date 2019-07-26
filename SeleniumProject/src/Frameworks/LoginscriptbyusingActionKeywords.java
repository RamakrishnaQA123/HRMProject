package Frameworks;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class LoginscriptbyusingActionKeywords {
@Test
	public void login() throws IOException {
	ActionKeywords key=new ActionKeywords();
	FileInputStream f=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\ActionKeywords.xlsx");
		 XSSFWorkbook wbo=new XSSFWorkbook(f);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		
	int  rowc=wso.getLastRowNum();
		for (int i=1;i<rowc;i++){
		r=wso.getRow(i);
		String runmode=r.getCell(4).getStringCellValue();
		if(runmode.equals("Y")){
	String action=r.getCell(3).getStringCellValue();
			if(action.equals("launchbrowser")){
				key.launchbrowser();
			}
			else if(action.equals("navigate")){
				key.navigate();
			}
			else if(action.equals("enterusername")){
				key.enterusername();
			}
			else if(action.equals("enterpassword")){
				key.enterpassword();
			}
			else if(action.equals("login")){
				key.login();
			}
		     
     
     
     
     
     
	 }
 }


	
		
		
		
		
		
	}
	
	
}
