package Instance_Variables;

public class Instance_Division 
{
	int divnum1 = 9;
	int divnum2 = 3;
	int div = divnum1 / divnum2; //doing division operation
	
	public static void main(String args[])
	{
		//Creating the object of Instance_Division class
		Instance_Division id = new Instance_Division();
		
		System.out.println("Division of two Instance Variable values is : " + id.div); //id.div will refer to Instance Variable div
		
	}
}
