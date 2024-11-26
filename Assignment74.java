//Assignment 74: WAP for Encapsulation
package java_assignments;

class Student_info
{
	private String emailid="cetuniversity@gmail.com";

	public String getEmailid() 
	{
		return emailid;
	}

	public void setEmailid(String emailid) 
	{
		this.emailid = emailid;
	}
	
}
public class Assignment74 
{
	public static void main(String[] args) 
	{
	
		Student_info a1=new Student_info();
		a1.setEmailid("gopikamohanan@gmail.com");
		System.out.println(a1.getEmailid());
	}
}
