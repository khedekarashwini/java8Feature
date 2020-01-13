package com.foreachmethodTest;

import java.util.HashMap;
import java.util.Map;

class Employee
{
   int id;
   String name;
   
   public Employee(int id,String name)
   {
	   this.id=id;
	   this.name=name;
	   
   }

}

class Department
{
    String DeptName;

	public Department(String deptName) {
		super();
		DeptName = deptName;
	}
    
   
}
public class ForeachMethodOnMap {

	public static void main(String[] args) {
         
		
		Map<Employee, Department> ed=new HashMap<Employee, Department>();
            ed.put(new Employee(101, "ashwini"),new Department("Production"));
            ed.put(new Employee(102, "Arti"), new Department("Purches"));
            ed.put(new Employee(103, "sagar"), new Department("Logistic"));

ed.forEach((key,val)-> System.out.println("Key.."+key.id+" "+key.name+" "+"Vlaue.."+val.DeptName));
	}

}
 