package WorkingwithExcelbyApachiPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex1 {

	public static void main(String[] args) throws
	                                   IOException {
	FileInputStream fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Demofile.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fso);
	XSSFSheet wso=wbo.getSheet("sheet1");
	Row r;
	int rowc=wso.getLastRowNum();
	for(int i=0;i<rowc;i++){
		r=wso.getRow(i);
	int colc=r.getLastCellNum();
	for(int j=0;j<colc;j++){
		System.out.print(r.getCell(j).getStringCellValue()+" ");
	}

	System.out.println();
}
	
  FileOutputStream fo=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Demofile.xlsx");
  wbo.write(fo);
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
