/*Assignment 51: WAP in which super most interface class having 2AM, 
 * abstract class having 2AM&2CM, subclass having 2CM
*/
package java_assignments;

interface University4
{
	void university_login();
	void university_registration();
}
abstract class Student4 implements University4
{
	abstract void student_login();
	abstract void student_registration();
	void pay_tutionfee()
	{
		System.out.println("Calling Concrete Method - pay_tutionfee from abstract class Student4");
	}
	void attend_class()
	{
		System.out.println("Calling Concrete Method - attend_class from abstract class Student4");
	}
}
public class Assignment51 extends Student4
{
	public static void main(String[] args) 
	{
		Assignment51 a51= new Assignment51();
		a51.university_login();
		a51.university_registration();
		a51.student_login();
		a51.student_registration();
		a51.pay_tutionfee();
		a51.attend_class();
		a51.assignmnet_submission();
		a51.assignmnet_correction();
	}
	void assignmnet_submission()
	{
		System.out.println("Calling Concrete Method - assignmnet_submission from subclass Assignment51");
	}
	void assignmnet_correction()
	{
		System.out.println("Calling Concrete Method - assignmnet_correction from subclass Assignment51");
	}
	public void university_login() 
	{
		System.out.println("Calling Abstarct method - university_login from interface University4");
	}

	public void university_registration() 
	{
		System.out.println("Calling Abstarct method - university_registration from interface University4");
	}

	public void student_login() 
	{
		System.out.println("Calling Abstarct method - student_login from interface Student4");
		
	}

	public void student_registration() 
	{
		System.out.println("Calling Abstarct method - student_registration from interface Student4");
		
	}
}

