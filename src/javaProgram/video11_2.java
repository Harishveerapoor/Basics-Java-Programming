package javaProgram;


class parent{
	public void method() {
		System.out.println("yes this me");
	}
	
}

class child extends parent{
	public void method() {
		System.out.println("not me");
	}
}

public class video11_2 extends child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		video11_2 n=new video11_2();
		n.method();
		

		// type  2 mwthod overriding
		
		parent  ne=new parent();
		ne.method();
	}

}
