package Javaprogrames;

class mysubj1{//Supper
	void m1(){
		System.out.println("Manual");
	}
}
class mysubj2 extends mysubj1{//Supper
	void m1(){
		System.out.println("Automation");
	}
}
class mysubj3 extends mysubj2{//subclass
	void m1(){
		System.out.println("Selenium");
	}
}
public class ExampleofMethodOverriding {

	public static void main(String[] args) {
  
		  mysubj3 obj=new mysubj3();
		  obj.m1();
	}

}
