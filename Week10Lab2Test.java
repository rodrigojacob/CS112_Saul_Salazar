/*SAC CS112 Introduction to Java Programming.
Lab2
Extend the Dice class
with a Method
Throw(int bounces)
1 = call random once
2 = call random twice, return average
….
Test the Dice class in the main program.*/

public class Week10Lab2Test
{
	public static void main(String[] args){
        int val1;
        int val2;
        Week10Lab2 testObject = new Week10Lab2();
        val1 = testObject.Throw(3);
        val2 = testObject.Value();
        System.out.println(val1);
        System.out.println(val2);

	}
}
