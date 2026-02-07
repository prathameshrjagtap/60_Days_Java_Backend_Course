package Day4;

public class Datatype_double 
{
	double num1 = 30.21; 
	
	public static void main(String args[])
	{
		double num2 = 21.41;
		
		//Creating object of Datatype_double
		Datatype_double dDub = new Datatype_double();
		
		System.out.println("Instance variable value is : " + dDub.num1);//prints 30.21
		
		System.out.println("Local variable value is : " + num2);//print 21.41
	}
}
