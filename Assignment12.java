//Assignment 12:Area of Circle using Math class
package java_assignments;

public class Assignment12 
{
	static double pi = Math.PI;
	public static void main(String[] args) 
   {
	 
	 for (double i = 0; i<5; i++)
	 {
		 double r = Math.random();	 
		 System.out.println("The value of r is => "+r);
		 double Area =pi*r*r;
		 System.out.println("Area of circle => "+Area);
	 }
   } 
}
