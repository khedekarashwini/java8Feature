package com.foreachmethodTest;
@FunctionalInterface
interface I1
{
	void show();
	
	default void disp()
	{
		System.out.println("In I1 display");
	}

}
interface I2
{
	
  
  
   
   default void disp()
   {
	   System.out.println("In I2 display");
   }
}

class Abc implements I1,I2
{

	@Override
	public void show() {
	    System.out.println("In show Method");	
		
	}
	
	
	public void disp()
	{
		I2.super.disp();
		System.out.println("In overrride disp");
	}
	
	


}
public class DemoInterface 
{

	
   public static void main(String[] args) {
	
 
	Abc a=new Abc();
    a.disp();
    a.show();
  
}
}