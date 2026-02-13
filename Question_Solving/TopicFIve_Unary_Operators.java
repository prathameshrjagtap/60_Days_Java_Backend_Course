package Question_Solving;

public class TopicFIve_Unary_Operators {
	public static void main(String args[]) {
		/*Topic 5: Unary Operators (++, --, !)
		1.If int count = 10;, what is the value of count after count++;?
		2.What is the difference between ++x (prefix) and x++ (postfix)?
		3.If int x = 5;, what is the result of System.out.println(x++);?
		4.If int y = 5;, what is the result of System.out.println(++y);?
		5.What is the value of result in this code: int a = 1; int result = ++a + a++;?*/
		/*-------------------------------------------------------------------------------*/
		//Question 1
		int count = 10;
		count++;
		System.out.println("Value of count after count++ is: " + count);
		//Question 2
		int x = 20;
		System.out.println("Value of x before increment is: " + x); //prints 20
		System.out.println(++x); //prefix increments the value of x first and then prints it
		System.out.println("Value of x after prefix increment is: " + x); //prints 21
		System.out.println(x++); //postfix prints 21, the value first and then increments it(stored in memory if not printed)
		System.out.println("value of x after postfix increment is: " + x); //prints 22 
		//Question 3
		int X = 5;
		System.out.print("Result of System.out.println(X++), is: ");
		System.out.println(X++); //prints 5 and +1 stored in memory
		//Question 4
		int y = 5;
		System.out.print("Result of System.out.println(++y), is: ");
		System.out.println(++y); //prints 6
		//Question 5
		int a = 1;
		int result = ++a + a++; //here first a=1 increments in ++a (prefix) becomes 2 then + a++ (postfix) remains 2 then it increments with +1, Note: if we print this statement with sysout then we can see the result as 4 and +1 in stored in memory.
		System.out.println("The value of result is: "+ result); //prints 4, note +1 is stored in memory
		/*-------------------------------------------------------------------------------*/
	}
}
