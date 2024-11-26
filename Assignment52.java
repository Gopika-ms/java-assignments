//Assignment 52:Create class and inherit property of interface
package java_assignments;

interface University5
{
	void university_login();
	void university_registration();
}
public class Assignment52 implements University5
{
	public static void main(String[] args)
	{
		Assignment52 a52= new Assignment52();
		a52.university_login();
		a52.university_registration();
	}
	public void university_login() 
	{
		System.out.println("Calling Abstarct method - university_login from interface University5");
	}

	public void university_registration() 
	{
		System.out.println("Calling Abstarct method - university_registration from interface University5");
	}
}
