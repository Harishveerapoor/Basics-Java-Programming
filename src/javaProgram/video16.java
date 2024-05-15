package javaProgram;

import java.util.ArrayList;
import java.util.LinkedList;

public class video16 {

	public static void main(String[] args) {
		// homoginous
	   ArrayList< String> n=new ArrayList<String>();
	   n.add("harish");
	   n.add("veerapoor");
	   System.out.println(n);
	   n.add("or");
	   n.add("veera");
	   n.remove(1);
	   System.out.println(n);
	   
  for(int i=0;i<n.size();i++) {
	  System.out.println(n.get(i));
  }
		

	}
	
	
	
	
}
