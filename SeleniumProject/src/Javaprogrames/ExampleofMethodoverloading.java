package Javaprogrames;

class myvalue{
	void m1(){
		System.out.println("Selenium");
	}
   void m1(String a){
	   System.out.println(a);
	}
   void m1(int x,int y){
	   System.out.println(x+y);
		
	}
   void m1(String a,int x){
		System.out.println(a+x);
	}
   void m1(int x){
		System.out.println(x);
	}
   void m1(char e){
	   System.out.println('e');	
	}
}
public class ExampleofMethodoverloading {
	public static void main(String[] args) { 
	myvalue obj=new myvalue();
	obj.m1();
	obj.m1(100);
	obj.m1('a');
	obj.m1(100, 200);
	obj.m1("Selenium");
	obj.m1("Testing",100);
		
		
		
	}

}
