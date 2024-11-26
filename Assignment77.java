//Assignment 77:WAP to convert int to byte(Narrowing)
package java_assignments;

public class Assignment77 
{
	public static void main(String[] args) 
	{
		int i = 100;
		byte b1=(byte) i;
		System.out.println("Printing value after narrowing -> " + b1);
	}
}
