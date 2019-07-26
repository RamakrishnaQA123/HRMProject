package Javaprogrames;
 class myclass{
	static  int a=10;
	static  int b=20;
	 int c=30;//instance
	static  void m1(){
		 int d;//local
		 d=a+b;
		System.out.println(d);
	}
	void m2(){
		int e;//local
		e=b+c;
		System.out.println(e);
	}
}
public class Demo2 {

	public static void main(String[] args) {
	myclass obj=new myclass();	
	obj.m1();
	obj.m2();
		
  

	}

}
