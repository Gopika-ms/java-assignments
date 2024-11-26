//Assignment 76:WAP for class typecasting(combination of upcasting and downcasting)
package java_assignments;

class Parent_Class_Scanner
{
	void scanner_method()
	{
		System.out.println("This is a parent class of Scanner");
	}
}
public class Assignment76 extends Parent_Class_Scanner
{
	 Parent_Class_Scanner p1=new Assignment76();
	 Parent_Class_Scanner p2=(Parent_Class_Scanner) new Assignment76();
	 Assignment76 a1= (Assignment76) p1;
}
