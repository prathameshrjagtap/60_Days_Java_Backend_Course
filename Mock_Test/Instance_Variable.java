package Mock_Test;

//We are having one class into that we are having an instance variable and we have to print that inctance variable in java
public class Instance_Variable {
	int insNum1 = 12; // Instance Variable

	public static void main(String[] args) {
		// Creating a object of Instance_Variable class
		Instance_Variable instance_Variable = new Instance_Variable();
		int insNum2 = instance_Variable.insNum1 + 18;//i struggled here
		System.out.println("The value of Instance Variable is: " + instance_Variable.insNum1);
		System.out.println(insNum2);
	}

}
