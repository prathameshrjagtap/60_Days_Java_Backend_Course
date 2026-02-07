package Day4;

public class Datatype_float 
{
	float insnum1 = 3.14f;//Instance variable
	static float num2 = 4.15f;//Static variable
	
	public static void main(String args[])
	{
		float num3 = 4.78f;//Local variable
		
		//Creating object of Datatype_float class
		Datatype_float df = new Datatype_float();
		
		System.out.println("Instance variable value is : " + df.insnum1);//prints 3.14
		System.out.println("Static variable value is : " + num2);//prints 4.15
		
		System.out.println("Local variable value is : " + num3);//prints 4.78
	}
}
