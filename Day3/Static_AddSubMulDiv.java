package Day3;

public class Static_AddSubMulDiv 
{
	static int num1 = 9;
	static int num2 = 3;
	
	//Operations to perform
	static int sum = num1 + num2;
	static int sub = num1 - num2;
	static int mul = num1 * num2;
	static int div = num1 / num2;
	
	public static void main(String args[])
	{
		System.out.println("Addition of two Static Variable values is : " + sum); //sum will display the result of Addition
		
		System.out.println("Subtraction of two Static Variable values is : " + sub); //sub will display the result of Subtraction
		
		System.out.println("Multiplication of two Static Variable values is : " + mul); //mul will display the result of Multiplication
		
		System.out.println("Division of two Static Variable values is : " + div); //div will display the result of Division
		
	}
}
