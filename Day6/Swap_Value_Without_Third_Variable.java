package Day6;

public class Swap_Value_Without_Third_Variable {
	public static void main(String args[]) {
		//Program to swap the numbers
		int a = 12;
		int b = 33;
		System.out.println("Value before swap a: " + a + "\nValue before swap b: " + b);
		
		a = a + b; // 12 + 33 = 45
		b = a - b; // 45 - 33 = 12
		a = a - b; // 45 - 12 = 33
		System.out.println("Value after swap a: " + a + "\nValue after swap b: " + b);
	}
}
