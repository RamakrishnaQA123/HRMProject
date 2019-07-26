package Javaprogrames;

public class ExampleofExceptionhandling {

	public static void main(String[] args) {
         try
         {
		int [] value=new int [3];
		  value[0]=10;
		  value[1]=20;
		  value[2]=30;
		  value[3]=40;
		  System.out.println(value[3]);
         }
         catch(Exception x)
         {
        	 System.out.println(x);
         }
		
		System.out.println("Selenium Testing");
		
	}

}
