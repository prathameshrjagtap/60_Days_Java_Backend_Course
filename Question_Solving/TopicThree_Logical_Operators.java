package Question_Solving;

public class TopicThree_Logical_Operators {
	public static void main(String args[]) {
		/*Topic 3: Logical Operators (&&, ||, !)
		1.If A = true and B = false, what is the result of A && B?
		2.What is the result of !(5 > 2)?
		3.In the expression (true || (5 / 0 == 0)), does Java check the second part? (This is called Short-Circuiting).		
		4.Write a condition that checks if a number x is between 10 and 20 (inclusive).
		5.What is the result of (false && true) || true? */
		/*-------------------------------------------------------------------------------*/
		//Question 1
		boolean A = true;
		boolean B = false;
		System.out.print("Output of A&&B is: ");
		System.out.println(A && B); //false
		//Question 2
		System.out.print("Output of !(5 > 2) is: ");
		System.out.println(!(5 > 2)); //false
		//Question 3
		System.out.print("Output of true || (5/0 == 0) is: ");
		System.out.println(true || (5/0 == 0)); // Didn't got divide by 0 exception because of true keyword. Result is true
		//Question 4
		int X = 12;//taking for comparison
		System.out.print("x is between 10 and 20, true or false: ");
		System.out.println(10<= X || X <=20);//true, cause X = 12
		//Question 5
		System.out.print("Result of (false && true) || true? is: ");
		System.out.println((false && true) || true); //true, cause F | T = T
		/*-------------------------------------------------------------------------------*/
	}
}
