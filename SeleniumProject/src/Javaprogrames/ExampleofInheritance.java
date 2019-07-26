package Javaprogrames;

class sub1{//supper
	void m1(){
		System.out.println("Manual");
	}
}
class sub2 extends sub1{//supper
	void m2(){
		System.out.println("Automation");
	}
}
class sub3 extends sub2{//sub class
	void m3(){
		System.out.println("core java");
	}
}
public class ExampleofInheritance {

	public static void main(String[] args) {

		sub3 s=new sub3();
		s.m1();
		s.m2();
		s.m3();
	}

}
