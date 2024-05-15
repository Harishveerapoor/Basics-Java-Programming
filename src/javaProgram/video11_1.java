package javaProgram;
class overloading{
	public int add(int x, int y) {
		int z=x+y;
		System.out.println(z);
		return z;
		
	}
	public int add(int x, int y,int c) {
		int z=x+y;
		System.out.println(z);
		return z;
		
	}
	public int add(int x, int y,int d,String g) {
		int z=x+y+d;
		System.out.println(z);
		System.out.println(g);
		return z;
		
	}
	
	
}


public class video11_1 extends overloading {

	public static void main(String[] args) {

		// overloading
		
		video11_1 n=new video11_1();
		n.add(12, 3);
		n.add(2, 3, 4);
		n.add(2, 3,5,"harish");
		
		
	}

}
