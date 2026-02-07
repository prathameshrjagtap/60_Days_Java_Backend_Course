package Instance_Variables;

public class Instance_Addition 
{
	int num1 = 5;
	int num2 = 7;
	int sum = num1 + num2; //Addition operation  
	
	public static void main(String args[])
	{
		//Creating object of Instance_Addition Class
		Instance_Addition ia = new Instance_Addition(); //ia is object for Instance_Addition Class
		
		System.out.println("Addition of two Instance Variable values is : " + ia.sum); //ia.sum will refer to the Instance variable sum 
	}
}
