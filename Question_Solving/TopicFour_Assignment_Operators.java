package Question_Solving;

public class TopicFour_Assignment_Operators {
	public static void main(String args[]) {
		/*Topic 4. Assignment Operators (=, +=, -=, *=, /=)
		1.If int y = 5;, what is the value of y after y += 10;?
		2.How would you write x = x * 2 using a shorthand assignment operator?
		3.If int k = 20;, what is the result of k /= 4;?
		4.What happens if you try 10 += 5; without a variable? (Is it valid?)
		5.If int a = 10; a -= 5 + 2;, what is the final value of a?*/
		/*-------------------------------------------------------------------------------*/
		//Question 1
		int y = 5;
		y+=10; //y = y + 10 i.e. 5 + 10 = 15
		System.out.println("Value of y after y+=10 is: " + y); //prints 15
		//Question 2
		int x = 4;
		x *= 2; //Shorthand for x = x * 2
		System.out.println("Value of x after using shorthand x*=2 is: " + x); //prints 8
		//Question 3
		int k = 20;
		System.out.print("Output of k/=4 is: ");
		System.out.println(k/=4); //prints 5
		//Question 4
		int Ten = 10;//Value 10 stored in a local integer variable to print the result
		System.out.print("The output of 10 += 5 with using variable is: ");
		System.out.println(Ten+=5); // 10 += 5; without a variable is not valid left side must be variable.
		//Question 5
		int a = 10;
		a -= 5 + 2;
		System.out.println("Value of a after a-=5+2 is: " + a);// prints 3, because of the precedence the arithmetic operation executes first then assignment operation happens
		/*-------------------------------------------------------------------------------*/
	}
}
