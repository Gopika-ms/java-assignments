//Assignment 9:Find Area of Rectangle using Scanner class
package java_assignments;

import java.util.Scanner;

public class Assignment9 
{
	static void AreaRectangle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lenght of rectangle");
    	int l =s.nextInt();
    	System.out.println("Enter the breadth of rectangle");
    	int b =s.nextInt();
    	int a2 = l*b;
    	System.out.println("Area of Rectangle - "+a2);
	}
	public static void main(String[] args) 
	{
		AreaRectangle();
		
	}
}
