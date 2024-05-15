package javaProgram;
// inheritance methods
interface parent1{
	
	 void run();  // abstract method  we cannot achive a non abstract method in interface
}
interface son{
	 void dontrun();
}

public class video12 implements parent1,son{

	public static void main(String[] args) {
      
		video12 n=new video12();
		n.dontrun();
        n.run();
	}

	@Override
	public void dontrun() {
	 System.out.println("the hero");
		
	}
  
	@Override
	public void run() {
		
		 System.out.println("the hero is back");
	}

}
