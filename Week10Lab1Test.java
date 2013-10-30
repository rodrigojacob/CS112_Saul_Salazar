/*Create a Dice class
with Methods
Throw() – return a random number between 1-6
Value() – Return current dice value
Test the Dice class in the main program*/
public class Week10Lab1Test
{
 public static void main(String[] args)
 {
    int val1;
    int val2;
        
        Week10Lab1 testObject = new Week10Lab1();
        
        val1 = testObject.Throw();
        val2 = testObject.Value();
        
        System.out.println(val1);
        System.out.println(val2);

	}

}