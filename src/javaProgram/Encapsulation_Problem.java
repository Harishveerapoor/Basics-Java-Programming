package javaProgram;

public class Encapsulation_Problem {


	private int length;
	private int breadth;



	Encapsulation_Problem (int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void getarea() {
		int area= length*breadth;
		System.out.println("the arae is = "+area);
	}
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Encapsulation_Problem st=new Encapsulation_Problem(3,4);
		st.getarea();
		

	}

}
