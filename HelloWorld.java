import java.util.Scanner;
/**
  * @jdoc comment
  *
  *
  */
public class HelloWorld{
	// a comment
	public static void main(String[] args){
		int myAge = 34;
		char mySex = 'M';
		double myHeight = 5.9;
		String name;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Hello World, again.");
		System.out.println("I am " + myAge + " years old.");
		System.out.println("I am a " + mySex);
		System.out.println("I am " + myHeight + " ft tall");
		/* for multi line comments
		use these things */
		System.out.println("What is your name?");
		name = inputDevice.nextLine();
		System.out.println("Hello " + name + ", welcome to class.");
		
	}
}