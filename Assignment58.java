//Assignment 58: WAP to perform add,sub,multi,div using same 2 variables in switch case
package java_assignments;

import java.util.Scanner;

public class Assignment58 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please entervthe value of a");
	int a=s1.nextInt();
	System.out.println("Please enter the value of b");
	int b=s1.nextInt();
	System.out.println("Please enter your selection:");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	int input=s1.nextInt();
	switch(input)
	{
	case 1:	System.out.println("Addition ->" + (a+b));
			break;
	case 2: System.out.println("Subtraction ->" + (a-b));
			break;
	case 3: System.out.println("Multiplication ->" + (a*b));
			break;
	case 4: System.out.println("Division ->" + (a/b));
			break;
	default:
			System.out.println("Your Selection is wrong, Can you try again please?");
	}
}
}
