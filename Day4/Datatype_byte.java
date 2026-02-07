package Day4;

public class Datatype_byte 
{
	//Data Type --> byte, Size --> 1 byte, Range --> -128 to +127 
	byte insNum1 = 33; //Instance Variable
	static byte statnum1 = -99; //Static Variable
	
	public static void main(String args[])
	{
		//Local Variables
		byte num1 = 120;
		byte num2 = -127;
		
		//Creating object of Datatype_byte class
		Datatype_byte in = new Datatype_byte();
		
		System.out.println("Instance Variable value is : " + in.insNum1); //prints 33	
		System.out.println("Static Variable value is : " + statnum1); //prints -99
		
		System.out.println("Num1 value is : " + num1); //prints 120	
		System.out.println("Num2 value is : " + num2); //prints -127
	}
}
