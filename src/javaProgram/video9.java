package javaProgram;

// Abstarct method 

abstract class hari {
	hari(){
		System.out.println(" yah we can write constructor in abstract class");
	}
	abstract void run();
	public void tell() {
		System.out.println("yah this is non abstarct");
	}
	static void ru() {
		System.out.println("helo");
		int e=10;
		System.out.println(e);
	}
	
}

public class video9 extends hari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		video9 ha =new video9();
		ha.run();
		ha.tell();
		ha.ru();
	}

	@Override
	void run() {
	 System.out.println("yah this abstract method run");
		
	}

}
