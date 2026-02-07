package Day4;

public class Datatype_int 
{
	int num1 = 124; //Instance variable
	static int num2 = -401;
	
	public static void main(String args[])
	{
		//local variable
		int num3 = 21;
		
		//creating object of Datatype_int class
		Datatype_int di = new Datatype_int();
		
		System.out.println("Instance variable value is : " + di.num1);//prints 124
		System.out.println("Static variable value is : " + num2);//prints -401
		
		System.out.println("Local variable value is : " + num3);//prints 21
	}
}
