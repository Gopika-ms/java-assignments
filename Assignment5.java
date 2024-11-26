//Assignment 5:Find Area of Circle using Scanner  class
package java_assignments;

import java.util.Scanner;

public class Assignment5 
{
	static void AreaCircle()
	{
		double pi=3.14;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
    	double r =s.nextDouble();
    	double a1 = pi*r*r;
    	System.out.println("Area of Circle - "+a1); 
    	
	}
	public static void main(String[] args) 
	{
		AreaCircle();
	}
	
}
