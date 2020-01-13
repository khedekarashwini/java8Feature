package com.foreachmethodTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ForeachMethodUsingArrayList {

	public static void main(String[] args) {
		/*System.out.println("sys");
	  List<Integer> l1=new ArrayList();
	    for(int i=0;i<100;i++)
	    {
	    	l1.add(i);
	    }
l1.forEach(k ->System.out.println("Key"+k));
*/    
  
		String[] str={"ashwini","snehal","Neha"};
		 List<String> l1=new ArrayList<>();
		l1=Arrays.asList(str);
		 
		 l1.forEach(k -> System.out.println("List of name.."+k));
		  
		  
		
	}

}
