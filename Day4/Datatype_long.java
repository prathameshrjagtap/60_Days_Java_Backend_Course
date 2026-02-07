package Day4;

public class Datatype_long 
{
	long num1 = 123456789;//Instance variable
	static long num2 = 985467;//Static variable
	
	public static void main(String args[])
	{
		long num3 = 1200;//local variable
		
		//Creating object of Datatype_long class
		Datatype_long dl = new Datatype_long();
		
		System.out.println("Instance variable value is : " + dl.num1);//prints 123456789
		System.out.println("Static variable value is : " + num2);//prints 985467
		
		System.out.println("Local variable value is : " + num3);//prints 1200
	}

}
