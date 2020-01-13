package com.foreachmethodTest;

interface A
{
	
   void m1();
   default void cal()
   {
	   System.out.println("Calculation is done");
   }
}

public class B  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new A(){

			@Override
			public void m1() {
			  System.out.println("In m1 abstract method");
				
			}};
			a.m1();
			a.cal();
	}


}
