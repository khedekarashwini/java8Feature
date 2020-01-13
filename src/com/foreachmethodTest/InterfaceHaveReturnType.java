package com.foreachmethodTest;


interface Squre
{
   int cal(int x);	

}


public class InterfaceHaveReturnType {

	public static void main(String[] args) {
     
       
		Squre s=(int x)->(x*x);
       
       int ans=s.cal(5);
       System.out.println(ans);
	}

}
