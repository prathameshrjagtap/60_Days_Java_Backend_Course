package Question_Solving;

public class TopicTwo_Relational_Operators {
	public static void main(String args[]) {
		/*Topic 2: Relational Operators (==, !=, >, <, >=, <=)
		1.What does 10 != 10 evaluate to?
		2.If a = 5 and b = 8, is the expression (a >= b) true or false?
		3.Which operator would you use to check if two variables are exactly the same?
		4.What is the boolean result of (10 + 5) <= 15?
		5.True or False: 5.0 == 5 in Java? */
		/*-------------------------------------------------------------------------------*/
		//Question 1
		System.out.print("10 != 10 evaluate to: ");
		System.out.println(10!=10);//false, because of comparison operators
		//Question 2
		int a = 5;
		int b = 8;
		System.out.print("Expression a>=b is: ");
		System.out.println(a>=b);//false
		//Question 3
		int nine = 9;
		int Nine = 9;
		System.out.print("To check if two variables are exactly the same we use ==, see the result: ");
		System.out.println(nine==Nine);// For checking equality we use == operator. Result is true
		//Question 4
		System.out.print("The boolean result of (10 + 5) <= 15, is: ");
		System.out.println((10 + 5) <= 15 );//true
		//Question 5
		System.out.print("True or False: 5.0 == 5, is: ");
		System.out.println(5.0 == 5);//true
		/*-------------------------------------------------------------------------------*/
	}
}
