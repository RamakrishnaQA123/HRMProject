package Frameworks;

import org.testng.annotations.Test;

public class Modular2 {
	
	Tc1counttext rm;

	@Test
	public void open(){
		rm=new Tc1counttext();
		rm.open();
		rm.Register("Ramakrishna","QA", "1111", "ramki.trainer", "Hyd", "hyd", "TG", "111","INDIA");
		
		
		
		
	}

}
