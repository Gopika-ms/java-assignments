//Assignment 55: WAP to access the 4 access specifiers within the same package
package java_assignments;

public class Assignment55a 
{
	public void director1()
	 {
		 System.out.println("Calling method with Access Specifier - public from Program1");
	 }
	 private void manager1()
	 {
		 System.out.println("Calling method with Access Specifier - private from Program1");
	 }
	 protected void lead1()
	 {
		 System.out.println("Calling method with Access Specifier - protected from Program1");
	 }
	 void associate1()
	 {
		 System.out.println("Calling method with Access Specifier - default from Program1");
	 }
}
