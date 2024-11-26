//Assignment 31:Write an array program to check whether it stores null value or not
package java_assignments;

public class Assignment31 
{
	public static void main(String[] args) 
	{
		String rollno[] = new String[4];
		rollno[0]="A101";		
		rollno[1]="A102";
		rollno[2]="";
		rollno[3]="A103";
		
		System.out.println("Displaying the value in array using for loop");
		for(int i=0;i<=3;i++)
		{
			System.out.println(rollno[i]);
		}
	}

}
