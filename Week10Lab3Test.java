/*Extend the Dice class
with a Constructor
Dice (int bounces)
Use bounces to implement Throw()
What should bounces be initialized to and how.
Test the Dice class in the main program.
*/
public class Week10Lab3Test
{
    public static void main(String[] args) {

        Week10Lab3 die = new Week10Lab3();
        System.out.println(die.Throw());
        System.out.println(die.Value());

        Week10Lab3 die2 = new Week10Lab3(3);
        System.out.println(die2.Throw());
        System.out.println(die2.Value());

    }

}
