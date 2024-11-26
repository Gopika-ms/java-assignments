//Assignment 53:WAP in which we are writing extends & implements keywords in a subclass
package java_assignments;

class Lead1
{
	void assign_task()
	{
		System.out.println("Calling method - assign_task from class Lead");
		
	}
}
interface Associate1
{
	void task_execution();
}

public class Assignment53 extends Lead1 implements Associate1
{
	public static void main(String[] args) 
	{
		Assignment53 a53 = new Assignment53();
		a53.assign_task();
		a53.task_execution();
	}

	public void task_execution() 
	{
		System.out.println("Calling method - task_execution from interface Associate1");
	}
	
}
