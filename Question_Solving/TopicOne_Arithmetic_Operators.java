package Question_Solving;

public class TopicOne_Arithmetic_Operators {
	public static void main(String args[]) {
		/*Topic 1: Arithmetic Operators (+, -, *, /, %)
		1.What is the result of 15 % 4?
		2.If int x = 10 / 3;, what is the value stored in x? (Hint: Think about integer division).
		3.Write a single line of code to find the remainder when 100 is divided by 7.
		4.What is the result of "Java" + 11 + 5? (Careful with String concatenation!)
		5.Calculate the result of 10 + 5 * 2. Does it follow the BODMAS/PEMDAS rule?*/
		/*-------------------------------------------------------------------------------*/
		//Question 1
		System.out.print("The result of 15 % 4, is: ");
		System.out.println(15%4); //3
		//Question 2
		int x = 10/3;
		System.out.println("Value stored in x is: " + x); //3
		//Question 3
		System.out.print("The remainder when 100 is divided by 7 is: ");
		System.out.println(100%7); //2
		//Question 4
		System.out.println("Java" + 11 + 5); //Java115
		//Question 5
		int ten = 10;
		int five = 5;
		int two = 2;
		System.out.print("The result of 10 + 5 * 2, is: ");
		System.out.println(ten + five * two); //20 follows operator precedence order. here + > *
		/*-------------------------------------------------------------------------------*/
	}
}
