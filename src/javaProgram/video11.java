package javaProgram;

class A{
	int s=10;
	String str ="hareesh veerapoor";
	public void m1() {
		System.out.println(s);
		System.out.println(str);
	}
	
}
class B extends A{
	int x=10;
	String st="helo ";

	public  void m2() {
		System.out.println(x);
		System.out.println(st);
		
	}
	public void add() {
		System.out.println(x+s);
		System.out.println(st+str);
	}
}




public class video11 {

	public static void main(String[] args) {
		 B n=new B();
		 n.add();
		
		
	}

}
