package Day7;

public class Bitwise_Operator {
	public static void main(String args[]) {
		//Bitwise Operator: & | ^

		/*  		Truth Table
		 * A		B		A&B			A|B
		 * F		F		 F			 F
		 * F		T		 F			 T
		 * T		F		 F			 T
		 * T	    T		 T			 T 					 
		 * */
		//      8 4 2 1
		/* a=5; 0 1 0 1 = 5
		 * b=3; 0 0 1 1 = 3
		 * 
		 * 0 1 0 1  
		 * 0 0 1 1	
		 * ------------
		 * 0 0 0 1  &
		 * 0 1 1 1  |
		 * 0 1 1 0  ^
		 * 
		 * 				128 64 32 16  8 4 2 1	
		 * ex. a=16;  	  0  0  0  1  0 0 0 0	
		 * */
		int a = 5;
		int b = 3;
		
		System.out.println(a & b); //1
		System.out.println(a|b); //7
		System.out.println(a^b); //6
	}
}
