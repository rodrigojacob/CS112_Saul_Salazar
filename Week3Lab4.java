//SAC CS112 Java programming
//Write a program to read 2 numbers
//print the sum, difference, product, and quotient.
//Program uses class Scanner.
import java.util.Scanner;

//Declaring Class
public class Week3Lab4 {
	//Main Method
	public static void main( String[] args)
	{
			//Create a Scanner to obtain input from the command window.
		Scanner input = new Scanner( System.in );
		
		int number1; // first number to add.
		int number2; // second number to add.
		int sum; // sum of number1 and number2.
		int difr;// difference of number1 and number2.
		int prod;// product of number1 and number2.
		int quot;// quotient of number1 and number2.
		
		
		System.out.print("Enter first integer:");//prompt
	number1 = input.nextInt();//read first number from user
	
	System.out.print("Enter second integer:");//prompt
	number2 = input.nextInt();//read second number from user
		
	sum = number1 + number2;
	difr = number1 - number2;
	prod = number1 * number2;
	quot = number1 / number2;
	
	System.out.printf("Sum is %d\n" , sum);
	System.out.printf("Difference is %d\n" , difr);
	System.out.printf("Prodoct is %d\n" , prod);
	System.out.printf("Quotient is %d\n" , quot);
	
input.close();
	}
	

}
