package Day7;

public class Shift_Operator {
	public static void main(String args[]) {
		//Shift Operator: <<, >>, >>> 
		// << Left Shift(*)
		// >> Right Shift(/)
		// >>> unsigned Right Shift
		int a = 5;
		
		// << Left Shift Examples
		System.out.println("<< Left Shift examples * ");
		System.out.println(a<<1); //5*(2n)= 5*2*1 = 10
		System.out.println(a<<2); //5*2*2 = 20
		System.out.println(a<<3); //5*2*3 = 30
		System.out.println(a<<4); //5*2*4 = 40
		
		// >> Right Shift Examples
		System.out.println(">> Right Shift examples /");
		System.out.println(a>>1); //5/(2n)= 5/2 = 2 
		System.out.println(a>>2); //5/2*2= 5/4 = 1
		System.out.println(a>>3); //5/2*3= 5/5 = 0
		System.out.println(a>>4); //5/2*4= 5/6 = 0
		
		// >>> unsigned Right Shift
		System.out.println(a>>>1); //5/2=2
		System.out.println(a>>>2); //5/4=1
		System.out.println(a>>>3); //5/6=0
		
		
	}
}
