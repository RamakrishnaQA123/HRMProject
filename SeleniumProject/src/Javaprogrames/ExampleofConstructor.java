package Javaprogrames;

class myconstructor{
	myconstructor(){
		System.out.println("Welcome");
	}
	myconstructor(int a){
		System.out.println(a);
	}
	myconstructor(String x){
		System.out.println(x);
	}
	myconstructor(String x,String y){
		System.out.println(x+y);
	}
	myconstructor(int a,int b){
		System.out.println(a+b);
	}
}

public class ExampleofConstructor {

	public static void main(String[] args) {

myconstructor obj=new myconstructor();
myconstructor obj1=new myconstructor(100);
myconstructor obj2=new myconstructor("Selenium");
myconstructor obj3=new myconstructor("Testing","Selenium");
myconstructor obj4=new myconstructor(100,200);

	}

}
