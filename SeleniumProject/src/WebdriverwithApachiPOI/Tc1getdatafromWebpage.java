package WebdriverwithApachiPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1getdatafromWebpage {
	
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	FileOutputStream fo;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	
	@Test
	public void data() throws IOException{
		
	fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Demofile.xlsx");
  wbo=new XSSFWorkbook(fso);
wso=wbo.getSheet("sheet1");
Row r;


WebElement country=driver.findElement(By.name("country"));
List<WebElement>values=country.findElements(By.tagName("option"));
for(int i=0;i<values.size();i++){
	r=wso.getRow(i);
	r.createCell(1).setCellValue(values.get(i).getText());
if(r.getCell(0).getStringCellValue().equals(values.get(i).getText())){
		
		r.createCell(2).setCellValue("pass");
	}
		else
		{
		r.createCell(2).setCellValue("fail");
		}
	
	
	
}
	


 fo=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Demofile.xlsx");

wbo.write(fo);
	}
	
	
	
	
	
	

}
