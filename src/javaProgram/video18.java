package javaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class video18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1] Hashmap= does not maintaine the order and cant allow the dubicates
				HashMap<Integer, String> ha= new HashMap<Integer, String>();
				System.out.println("........Hashmap.........");
				ha.put(1,"hairsh");
				ha.put(2,"veerapoor");
				ha.put(3,"helo");
				
				ha.put(4,"hairsh");
				ha.put(5,"veerapoor");
				System.out.println(ha);
				
			// 2] linkedHashmap  maintaine input the order and  cant allow the dubicates
				LinkedHashMap<Integer, String> ha1= new LinkedHashMap<Integer, String>();
				System.out.println("........linkedHashmap.........");
				ha1.put(1,"hairsh");
				ha1.put(2,"veerapoor");
				ha1.put(3,"helo");
				
				ha1.put(4,"hairsh");
				ha1.put(5,"veerapoor");
				System.out.println(ha1);
				
				// 3] treemap maintain the sorted order and cant allow the dubicates
				TreeMap<Integer,String> ha12=new TreeMap<Integer,String>();
				System.out.println("........treemap.........");
				ha12.put(1,"z");
				ha12.put(2,"x");
				ha12.put(3,"a");
				
				ha12.put(4,"a");
				ha12.put(5,"a");
				System.out.println(ha12);

	}

}
