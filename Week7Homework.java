//SAC CS112 Java Programming.
//Saul Salazar
/*Homework|:
Enable player to play until done.
keep track of game tries.
Display game history: user, computer, winner*/

import java.util.Scanner;//Application


public class Week7Homework//Declaring class
{
//Method 
    public static void main(String[] args)
   {
   //Integers
    	int endGame=1;
        int num1;
        int computerNum;
        int numMoves = 0;
        int arrayCounter = 0;
        int compScore = 0;
        int userScore = 0;
        int compMoves[] = new int[100];
        int userMoves[] = new int[100];
        while (endGame!=0)
        //Statements
        {
            Scanner input = new Scanner(System.in);
            computerNum = 0 + (int) (Math.random() * 10 );
            
            System.out.println ("The game stars. Guess the number that I am thinking:");
            num1 = input.nextInt();
            
            if (num1==0){
                System.out.println("No 0, Enter another number:");
                num1 = input.nextInt();
            input.close();
            }
            compMoves[arrayCounter] = computerNum;
            userMoves[arrayCounter] = num1;
            arrayCounter++;            
            
            if (num1>computerNum) {
                System.out.println("Too High! Do you want to play again? 1 = YES  0 = NO.");
                endGame = input.nextInt();
                compScore++;
            }
            else if(num1<computerNum) {
                System.out.println("Too low! Do you want to play again?  1 = YES  0 = NO.");
                endGame = input.nextInt();
                compScore++;
            }
            else {
                System.out.println("You guessed it! Do you want to play again? 1=YES 0=NO.");
                endGame = input.nextInt();
                userScore++;
            }
            numMoves++;
        }
        System.out.println("Results:");
        for (int i=0; i<numMoves; i++){           
            System.out.println("Game: " + (i+1) + ". Computer played: " + compMoves[i] + ". User played: " + userMoves[i]);
        }
        if (userScore>compScore){
            System.out.println("You won more games than the computer! You are a winner!");
        }
        else {
            System.out.println("The computer won more games than you! Computer Won!");
        }
        System.out.println("Thank you, Comeback soon!");   
       
     }
}