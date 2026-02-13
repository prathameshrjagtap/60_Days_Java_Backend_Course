package Day7;

public class Assignment_Operator {
	public static void main(String args[]) {
		//Assignment Operator: =, +=, -=, *=, /=
		int a = 5;
		System.out.println("Value of a: " + a);
		
		a = a + 5; //adding 5 and saving the sum in local variable a
		System.out.println("Value of a = a + 5: " + a);
		a+=2; //adding 2 and saving the sum in local variable a
		System.out.println("Value of a+=5: " + a);
	}
}
