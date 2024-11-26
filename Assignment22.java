//Assignment 22:WAP in which abstract class is present along with concrete class
package java_assignments;

abstract class Student // Abstract class can have concrete methods
{
	void student_login() 
	 {
		 System.out.println("login - Concrete Method");
	 }
	
	abstract void student_registartion();

}
abstract class University1 extends Student
{
	//abstract class with abstract method
	abstract void university_login();
}
class Board extends University1
{
// create a class to write logic for unimplemented methods
	void university_login() 
	{
		System.out.println("university_login - Abstract Method");
	}

	void student_registartion() 
	{
		System.out.println("student_registartion - Abstract Method");
	}
}

public class Assignment22 extends Board
{
	public static void main(String[] args)
	{
		Assignment22 a1= new Assignment22();
		a1.student_login();
		a1.student_registartion();
		a1.university_login();
		
	}
}