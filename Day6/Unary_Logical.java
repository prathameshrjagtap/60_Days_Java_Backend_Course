package Day6;

public class Unary_Logical {
	public static void main(String args[]) {
		int a = 5;
		System.out.println(a++ + a++); //5 (+1) + 6 (+1) = 11 (+1)  
		System.out.println(++a + a++); //8 + 8 (+1) = 16 (+1)
		System.out.println(a++ + ++a); //9 (+1) + 11 = 20
		System.out.println(++a + ++a); //12 + 13 = 25 
		System.out.println(a++ + a++); //13 (+1) + 14 (+1) = 27 (+1) 
		System.out.println(++a + ++a); //16 + 17 = 33 
		System.out.println(a++ + ++a); //17 (+1) + 19 = 36
		System.out.println(++a + a++); //20 + 20 (+1) = 40 (+1)
	}
}
