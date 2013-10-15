//SAC CS112 Java Programming 2013
//Saul Salazar
/*Write a program to ask user to enter 2 numbers, 
 *Echo the 2 numbers back in the form of Hello, you enter xx and yy*/
import java.util.Scanner;

//Declaring Class
public class Week3Lab3 {
	//Main Method
	public static void main( String[] args)
	{
			//Create a Scanner to obtain input from the command window.
		Scanner input = new Scanner( System.in );
		
		int number1; // first number to add.
		int number2; // second number to add.
				
		System.out.print("Enter first integer:");//prompt
	number1 = input.nextInt();//read first number from user
	
	System.out.print("Enter second integer:");//prompt
	number2 = input.nextInt();//read second number from user

	
	System.out.printf("Hello, you enter %s\tand %s\t.",number1,number2 );
input.close();
	}
	
}
