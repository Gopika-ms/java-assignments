//Assignment 19: WAP on parameterized and non-parameterized this calling statement in java
package java_assignments;

public class Assignment19 
{
		Assignment19(int a)
		{
			System.out.println("Constructor with parameter");
		}
		Assignment19()
		{
			this(100);
			System.out.println("Constructor without parameter");
		}
		public static void main(String[] args) 
		{
			Assignment19 a19 = new Assignment19();

		}
}
