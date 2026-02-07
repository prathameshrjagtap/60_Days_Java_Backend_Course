package Day3;

public class Instance_AddSubMulDIv 
{
	int num1 = 9;
	int num2 = 3;
	
	//Operations to perform
	int sum = num1 + num2;
	int sub = num1 - num2;
	int mul = num1 * num2;
	int div = num1 / num2;
	
	public static void main(String args[])
	{
		//Creating object of Instance_AddSubMulDiv class
		Instance_AddSubMulDIv asmd = new Instance_AddSubMulDIv();
		
		
		System.out.println("Addition of two Instance Variable values is : " + asmd.sum); //asmd.sum to display sum
		
		System.out.println("\nSubtraction of two Instance Variable values is : " + asmd.sub); //asmd.sub to display sub
		
		System.out.println("\nMultiplication of two Instance Variable values is : " + asmd.mul); //asmd.mul to display mul
		
		System.out.println("\nDivision of two Instance Variable values is : " + asmd.div); //asmd.div to display div
		
	}
}
