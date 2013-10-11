import java.util.Scanner;

public class Week2HomeworkTest 
{
//Main method begins program execution
	public static void main(String[] args )
	{
	//create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		//create an object and assign in to myGradebook
		Week2Homework myWeek2Homework = new Week2Homework();
		
		//prompt for and input username
		System.out.println("Please enter the userName:");
		String username = input.nextLine();//read a line of text
		System.out.println();// outputs a blank line
		
		//call myWeek2Homework's displayMessage method
		//and pass userName as an argument
		myWeek2Homework.displayMessage( username );
	input.close();
	}
}