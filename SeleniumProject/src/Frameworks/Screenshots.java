package Frameworks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.sun.jna.platform.FileUtils;

public class Screenshots {
	
public static void capture123(WebDriver driver,String f ) 
			                    throws IOException {
	
File srcfile=((TakesScreenshot)driver)
                   .getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File(f));	


	}
	
}
