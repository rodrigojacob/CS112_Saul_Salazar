//SAC CS112 Java Programming
//Saul Salazar
/* Give Examples of:
 * High level language statement
 * Assembly language statement
 * Machine language statement*/

public class Week2Lab1//Declaring Class

{
//Declaring Method
	public static void main(String[] args) 
	{
		// Statements displaying text with multiple statements
System.out.println("High level language statement sample:");

System.out.println("grossPay = basePay + overTimePay");

System.out.println("");

System.out.println("Assembly languate statement sampple:");

System.out.println("mov edx, [esp+8]\ncmp edx, 0\nja @f\nmov eax, 0\nret");

System.out.println(" ");

System.out.println("Machine language sample:");

System.out.println("8B542408 83FA0077 06B80000 0000C383\nFA027706 B8010000 00C353BB 01000000\nB9010000 008D0419 83FA0376 078BD98B\nC84AEBF1 5BC3");
	}

}
