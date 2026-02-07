package Instance_Variables;

public class Instance_Multiplication 
{
	int multiply1 = 7;
	int multiply2 = 3;
	int mul = multiply1 * multiply2; //doing Multiplication Operation
	
	public static void main(String args[])
	{
		//Will create Object of Instance_Multiplication class
		Instance_Multiplication im = new Instance_Multiplication(); //im is object for Instance_Multiplication class
		
		System.out.println("Multiplication of two Instance variable is : " + im.mul); //im.mul will refer to the Instance Variable mul
		
	}
	
}
