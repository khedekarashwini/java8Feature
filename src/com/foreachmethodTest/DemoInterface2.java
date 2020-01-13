package com.foreachmethodTest;
interface Bike
{
     void run();	
}
interface FourWheeler
{
  void colour();
  default void model()
   {
	   
	   System.out.println("Bike Modell is xyz");
   }

}
public class DemoInterface2  {

	
	public static void main(String[] args) {
		
		
				
		Bike b1=()->System.out.println("Run Method call");
		b1.run();
		
		FourWheeler f1=()->System.out.println("Colour method call");
		f1.colour();
	}



	

	
}
