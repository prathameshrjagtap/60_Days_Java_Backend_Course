package Day4;

public class Datatype_short 
{
	//Data Type --> short, Size --> 2 byte, Range --> -32,768 to +32,767
	short insnum1 = 56; //Instance Variable
	static short statnum1 = 33; //Static Variable
	
	public static void main(String args[])
	{
		//Local Variables
		short localnum1 = -93;
		short localnum2 = 21;
		
		//Creating object of the Datatype_short class
		Datatype_short ds = new Datatype_short();
		
		System.out.println("Instance variable value is : " + ds.insnum1);//prints 56
		System.out.println("Static variable value is : " + statnum1);//prints 33
		
		System.out.println("Value of localnum1 is : " + localnum1);//prints -93
		System.out.println("Value of localnum2 is : " + localnum2);//prints 21
		
		
	}
}
