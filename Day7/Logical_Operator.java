package Day7;

public class Logical_Operator {
	public static void main(String args[]) {
		//Logical Operator: && || !
		/*  		Truth Table
		 * A		B		A&B			A|B
		 * F		F		 F			 F
		 * F		T		 F			 T
		 * T		F		 F			 T
		 * T	    T		 T			 T 			
		 
		 * */
		int a = 10;
		int b = 5;
		
		System.out.println(a>b && a>5); //true
		System.out.println(a<b || a<b); //false
		System.out.println(!(a<b)); //true
		System.out.println(a==b && a>b); //false
		System.out.println(a>=5 || !(a<=b)); //true
	}
}
