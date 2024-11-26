/*Assignment 57 : WAP to access the 4 access specifiers outside the package 
 * without becoming subclass */
package java_assignments;

public class Assignment57a 
{
	public void director2()
	 {
		 System.out.println("Calling method with Access Specifier - public from Program1");
	 }
	 private void manager2()
	 {
		 System.out.println("Calling method with Access Specifier - private from Program1");
	 }
	 protected void lead2()
	 {
		 System.out.println("Calling method with Access Specifier - protected from Program1");
	 }
	 void associate2()
	 {
		 System.out.println("Calling method with Access Specifier - default from Program1");
	 }
}
