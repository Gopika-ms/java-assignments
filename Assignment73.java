//Assignment 73:Wap to handle the exception using try and multiple  catch methods
package java_assignments;

import java.util.InputMismatchException;

public class Assignment73 
{
	public static void main(String[] args) 
	{
		try
		{
			int c=1/0;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled the exception - ArithmeticException");
		}
		catch(NullPointerException n1)
		{
			System.out.println("Handled the exception2 - NullPointerException");
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Handled the exception - InputMismatchException");
		}
	}
}
