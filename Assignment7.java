//Assignment 7: Find Area of Triangle using Scanner class
package java_assignments;

import java.util.Scanner;

public class Assignment7 
{
	static void AreaTriangle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height of triangle");
    	double h =s.nextDouble();
    	System.out.println("Enter the breadth of triangle");
    	double b =s.nextDouble();
    	double a4 = 0.5*h*b;
    	System.out.println("Area of triangle - "+a4);
	}
	public static void main(String[] args) 
	{
		AreaTriangle();	
	}
}
