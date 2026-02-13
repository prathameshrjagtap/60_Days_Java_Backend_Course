package Day6;

public class Swap_Value_Third_Variable {
	public static void main(String args[]) {
		int a = 40;
		int b = 25;
		int c = 0;
		System.out.println("Value before swap a: " + a + "\nValue before swap b: " + b);
		
		c = a;
		a = b;
		b = c;
		System.out.println("Value after swap a: " + a + "\nValue after swap b: " + b);
		
	}
}
