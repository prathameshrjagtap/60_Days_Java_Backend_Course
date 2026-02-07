package Instance_Variables;

public class Instance_Subtraction 
{
	//Creating Instance variables
	int number1 = 30;
	int number2 = 9;
	int sub = number1 - number2; //Doing Subtraction Operation
	
	public static void main(String args[])
	{
		//Creating the object of Instance_Subtraction class
		Instance_Subtraction is = new Instance_Subtraction(); //"is" is object for Instance_Subtraction class
		
		System.out.println("Subtraction of two Instance variable values is : " + is.sub); //"is" will refer to Instance Variable sub 
		
	}
}
