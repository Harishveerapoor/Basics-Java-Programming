package javaProgram;

public class video4 {
	public void method1() {
		System.out.println("m1");
	}
	public void method2() {
		System.out.println("m2");
	}	
	static void method3() {
		System.out.println("m3");
	}
	  static void method4() {
		System.out.println("m4");
	}
	
	
	public static void main(String[] args) {
		
		// local variable 
		int a=9;
		System.out.println(a);
		// static
		method3();
		method4();
		//non static 
		video4 nonstatic=new video4();
		nonstatic.method1();
		nonstatic.method2();
	      
               
	}

}
