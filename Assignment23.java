/* Assignment 23 :WAP in which super most class having 2CM, 
 * abstract class having 2AM&2CM, subclass having 2CM */

package java_assignments;

class Manager //super most class having 2CM
 {
	 void create_task()
	 {
		System.out.println("Method - create_task in Concrete Class - Manager "); 
	 }
	 void assign_task()
	 {
		 System.out.println("Method - assign_task in Concrete Class - Manager ");
	 }
 }
abstract class Lead extends Manager// abstract class having 2AM&2CM
	{
		abstract void report_generation();
		abstract void defect_analysis();
		void review_task()
		 {
			System.out.println("Method - review_task in Concrete Class - Lead "); 
		 }
		void attend_meetings()
		 {
			System.out.println("Method - attend_meetings in Concrete Class - Lead ");
		 }
	}
class Associate extends Lead
	{
		void report_generation()
		{
			System.out.println("Method - report_generation in Abstract Class - Lead ");
		}
		void defect_analysis() 
		{
			System.out.println("Method - defect_analysis in Abstract Class - Lead ");	
		}
		void execution() 
		{
			System.out.println("Method - execution in Concrete Class - Associate ");	
		}
	}
public class Assignment23 extends Associate
	{
		public static void main(String[] args) 
		{
			Assignment23 a1= new Assignment23();
			a1.create_task();
			a1.assign_task();
			a1.review_task();
			a1.attend_meetings();
			a1.report_generation();
			a1.defect_analysis();
			a1.execution();			
		}
	}
	
