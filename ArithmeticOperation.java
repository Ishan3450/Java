public class ArithmeticOperation{
	public static void main(String[] args){
		int a = 10;
		int b = 20;

		ArithmeticOperations aOperation = new ArithmeticOperations();

		aOperation.addition(a,b);
		aOperation.subtraction(a,b);
		aOperation.multiplication(a,b);
		aOperation.division(a,b);
	}
}

//Below Code is a Practice of Both making Class, Declaring Methods in class and how to Access that methods in the Class and Arithmetic Operation.

class ArithmeticOperations{
	void addition(int n1,int n2){
		System.out.println("Addition of n1 and n2 is " + (n1+n2));
	}
	void subtraction(int n1,int n2){
		System.out.println("Subtraction of n1 and n2 is " + (n1-n2));
	}
	void division(int n1,int n2){
		System.out.println("Division of n1 and n2 is " + (n1/n2));
	}
	void multiplication(int n1,int n2){
		System.out.println("Multiplication os n1 and n2 is " + (n1*n2));
	}
}
