package Day5;

public class Operator_Java {
	public static void main(String args[]) {
		// Operators Unary
		int a = 12;
		int b = 10;
		
		System.out.println(a);   //12
		System.out.println(a++); //12 (+1)
		System.out.println(++a); //14
		System.out.println(a++); //14 (+1)
		System.out.println(++a); //16
		System.out.println(a++); //16 (+1)
		System.out.println(++a); //18
		System.out.println(a++); //18
		
		System.out.println(b);  //10
		System.out.println(b--); //10
		System.out.println(--b); //8
		System.out.println(b--); //8 -1 
		System.out.println(b--); //7 -1
		System.out.println(--b); //5  
		System.out.println(--b); //4
		System.out.println(b); //4
	}
}
