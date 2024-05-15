package javaProgram;

public class video10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String st="harishveerapoor";
		 String st1="hareesh";
		
		 System.out.println(st.toUpperCase());
		 System.out.println(st.toLowerCase());
		 System.out.println(st.indexOf('v'));
		 System.out.println(st.length());
		 System.out.println(st.charAt(4));
		
		 
		 System.out.println(st.compareTo(st1));
		 System.out.println(st.matches(st1));
		 System.out.println(st.equals(st1));
		 System.out.println(st.replace("hari", "hareesh"));
		 System.out.println(st.replace("harish", "narayana "));
		 
		 // concat 
		 System.out.println(st.concat(st1));
		 
		 
		 // string buffer we can run without using StringBuffer word
		 StringBuffer  stb=new StringBuffer("The");
		 StringBuffer  stb1=new StringBuffer(" Hero");
		 System.out.println(stb.append(stb1));
		 
		 System.out.println(st.replace(st, st1));
	     // stringbuilder
		 StringBuilder st9=new StringBuilder("huh");
		 StringBuilder st10=new StringBuilder("yha ");
		 System.out.println(st9.append(st10));
		 System.out.println(st9);
		 System.out.println(st10);
		 
	
	}

}
