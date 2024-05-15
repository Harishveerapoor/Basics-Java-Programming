package javaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class video17 {

	public static void main(String[] args) {
		//1] Hashset= does not maintaine the order and cant allow the dubicates
		HashSet<String> ha=new HashSet<String>();
		System.out.println("........Hashset.........");
		ha.add("hairsh");
		ha.add("veerapoor");
		ha.add("helo");
		
		ha.add("hairsh");
		ha.add("veerapoor");
		System.out.println(ha);
		
	// 2] linkedHashset maintaine input the order and  cant allow the dubicates
		LinkedHashSet<String> ha1=new LinkedHashSet<String>();
		System.out.println("........linkedHashset.........");
		ha1.add("hairsh");
		ha1.add("veerapoor");
		ha1.add("helo");
		
		ha1.add("helo");
		ha1.add("helo");
		System.out.println(ha1);
		
		// 3] treeset maintain the sorted order and cant allow the dubicates
		TreeSet ha12=new TreeSet();
		System.out.println("........treeset.........");
		ha12.add("z");
		ha12.add("x");
		ha12.add("a");
		
		ha12.add("a");
		ha12.add("a");
		System.out.println(ha12);
	}

}
