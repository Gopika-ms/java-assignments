//Assignment 28: Write a program where you get Negative Array size exception.
package java_assignments;

public class Assignmenmt28 
{
	public static void main(String[] args) 
	{
		int rollno[] = new int[-2];
		rollno[0]=36;		
		rollno[1]=45;
		
		System.out.println("Displaying the value in array using for loop");
		for(int i=0;i<=2;i++)
		{
			System.out.println(rollno[i]);
		}
	}
}
