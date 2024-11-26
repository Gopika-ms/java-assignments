//Assignment 6:Find circumference of circle using Scanner class

package java_assignments;

import java.util.Scanner;

public class Assignment6 
{
	static void CircumferenceCircle()
	{
		double pi=3.14;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
    	double r =s.nextDouble();
    	double c1 = 2*pi*r;
    	System.out.println("Circumference of Circle - "+c1);
	}
	public static void main(String[] args) 
	{
		CircumferenceCircle();	
	}
}
