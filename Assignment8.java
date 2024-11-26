//Assignment 8:Find Area of Square using Scanner class
package java_assignments;

import java.util.Scanner;

public class Assignment8 
{
	static void AreaSquare()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lenght of a side");
    	double a =s.nextDouble();
    	double a3 = a*a;
    	System.out.println("Area of Square - "+a3);
	}
	public static void main(String[] args) 
	{
		AreaSquare();
	}
}
