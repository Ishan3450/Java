import java.util.*;
import java.io.*;

// This is about Default Constuctor, Paremeterized Constructor and ConstructorOverloading

// public class classes{
// 	public static void main(String[] args){
// 		ConstructorOverloading ex = new ConstructorOverloading();

// 		ex.Student();
// 		ex.Student("Ishan","Jagani");
// 	}	
// }

// class ConstructorOverloading{
// 	void Student(){
// 		System.out.println("This Method is with Default constructor");
// 	}

// 	void Student(String fname,String lname){
// 		System.out.println("This Mehtod is with Parameterized constructor");
// 	}
// }

public class classes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		System.out.println("Length is " + name.length());
	}
}

