package Webdriverprogrames;

public class ConditionalStatements {

	public static void main(String[] args) {
     
		String signal="yellow";
		switch(signal){
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("dance");
			break;
		case "green":
			System.out.println("run");
			break;
		
		  default:
			  System.out.println("cry");
		}
		
	}

}
