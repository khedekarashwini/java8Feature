package com.foreachmethodTest;

import java.util.ArrayList;

public class RemoveIfMethod {

	public static void main(String[] args) {
	  ArrayList<String> s=new ArrayList<>();
	    s.add("Ashwini");
	    s.add("Sagar");
	    s.add("Sunita");
	    s.add("Reshma");
	    s.add("teja");
	    System.out.println("Original String"+s);
	    
	    s.removeIf(a ->(a.charAt(0)=='S'));
	      
	    System.out.println("Name Removed Starts with S ");
	      
	      for (String string : s) {
	    	    System.out.print(s);
			
		}

	}

}
