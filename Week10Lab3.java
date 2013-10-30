import java.util.Random;
/*Extend the Dice class
with a Constructor
Dice (int bounces)
Use bounces to implement Throw()
What should bounces be initialized to and how.
Test the Dice class in the main program.
*/
public class Week10Lab3
{
    private int m_value;
    private int m_bounces;
    Random rand = new Random();

    public Week10Lab3(int bounces) {
        m_bounces = bounces;
    }

    public Week10Lab3() {
        m_bounces = 1;
    }

    public int Throw() {
        int sum = 0;
        for (int i = 0; i < m_bounces; i++) {
            sum += rand.nextInt(6) + 1;
        }
        m_value = sum / m_bounces;
        return m_value;
    }

    public int Value() {
        return m_value;
    }
}
