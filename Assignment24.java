//Assignment 24:WAP on multiple level inheritance using Interface
package java_assignments;

interface University3
{
	void university_login();
	void university_registration();
}
interface Student3 extends University3
{
	void student_login();
	void student_registration();
}
public class Assignment24 implements Student3
{
	public static void main(String[] args) 
	{
		Assignment24 a24= new Assignment24();
		a24.university_login();
		a24.university_registration();
		a24.student_login();
		a24.student_registration();
	}
	public void university_login() 
	{
		System.out.println("Calling Abstarct method - university_login from interface University");
	}

	public void university_registration() 
	{
		System.out.println("Calling Abstarct method - university_registration from interface University");
	}

	public void student_login() 
	{
		System.out.println("Calling Abstarct method - student_login from interface Student");
		
	}

	public void student_registration() 
	{
		System.out.println("Calling Abstarct method - student_registration from interface Student");
		
	}
}
