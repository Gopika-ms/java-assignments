//Assignment 50: WAP to find the current date and time. 
package java_assignments;
import java.util.Date;

public class Assignment50 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println("Cuurent Epoch Time -> " +d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println("Current Time -> " +d2);
		
		Date d3=new Date(d1.getTime() + (1000*60*60*24*3));
		System.out.println("Future Time -> " +d3);
		
		Date d4=new Date(d1.getTime() - (1000*60*60*24*2));
		System.out.println("Past Time -> " +d4);
		
	}
}
