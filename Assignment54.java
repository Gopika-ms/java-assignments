//Assignment 54:WAP to access the 4 access specifiers within the same class
package java_assignments;


public class Assignment54 
{
public void director()
{
	 System.out.println("Calling method with Access Specifier - public");
}
private void manager()
{
	 System.out.println("Calling method with Access Specifier - private");
}
protected void lead()
{
	 System.out.println("Calling method with Access Specifier - protected");
}
void associate()
{
	 System.out.println("Calling method with Access Specifier - default");
}
public static void main(String[] args) 
{
	Assignment54 m1=new Assignment54();
	 m1.director();
	 m1.manager();
	 m1.lead();
	 m1.associate();
	
}
}
