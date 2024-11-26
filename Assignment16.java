/* Assignment 16: Multi level inheritance by using static and 
Non Static methods by using 4 classes */

package java_assignments;

class University
{
	static void university_expense()
	{
	System.out.println("Calling static method expense from University class");
	}
}

class College extends University
{
	static void college_expense()
	{
	System.out.println("Calling static method expense from College class");
	}
}

class School extends College
{
	void school_expense()
	{
	System.out.println("Calling non-static method expense from School class");
	}
}
class Kindergarten extends School
{
	void kindergarten_expense()
	{
	System.out.println("Calling non-static method expense from Kindergarten class");
	}
}
public class Assignment16 extends Kindergarten

{
	public static void main(String[] args) 
	{
		university_expense();
		college_expense();
		Assignment16 a16=new Assignment16();
		a16.school_expense();
		a16.kindergarten_expense();
		
	}
}

