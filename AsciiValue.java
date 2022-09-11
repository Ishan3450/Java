import java.util.*;

public class AsciiValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int asciiVal;	
		char c;
		System.out.println("Enter any Character :");
		c = sc.next().charAt(0);
		asciiVal = c;
		System.out.println("Ascii value of " + c + " : " + asciiVal);
	}
}
		