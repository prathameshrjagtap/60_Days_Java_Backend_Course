package Day6;

public class Java_Operators {
	public static void main(String args[]) {
		

		/*System.out.println(a++ + a++); //5 (+1) + 6 (+1) = 11 (+1)  
		System.out.println(++a + a++); //7 + 7(+1) = 14 (+1)
		System.out.println(a++ + ++a); //8 (+1) + 10 =  18
		System.out.println(++a + ++a); //11 + 12 = 23 
		System.out.println(a++ + a++); //12 (+1) + 13(+1) = 25(+1) 
		System.out.println(++a + ++a); //15 + 16 = 31
		System.out.println(a++ + ++a); //16 (+1) + 18 = 34 
		System.out.println(++a + a++); //19 + 19 (+1) = 38 (+1)*/
		
		/*System.out.println(a); //it will print value 5
		System.out.println('a'); //u ASCII value of Character A = 65
		System.out.println("a"); //it will only print a*/
		
		//System.out.println('p'+'r'+'a'+'t'+'h'+'a'+'m'+'e'+'s'+'h');// prathmesh
		
		int a=35; 
		int b=55; 
		
		System.out.println("Before Value of a =" + a);
		System.out.println("Before Value of b =" + b);
		/*int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);*/
		
		/*a = a - b;// 10 - 5 = a(5)
		b = a + b;// 5 + 5 = b(10)*/
		
		//a -> b diff 10
		a = a + b;//a= 40
		b= a-b;//b = 25
		a= a-b;//a = 15 
		System.out.println("Value of a =" + a);
		System.out.println("Value of b =" + b);
	}
}
