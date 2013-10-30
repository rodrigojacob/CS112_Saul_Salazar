/*Create a Dice class
with Methods
Throw() – return a random number between 1-6
Value() – Return current dice value
Test the Dice class in the main program*/

public class Week10Lab1
{
	    
		private int m_diceValue;
	    public int Throw(){
	        m_diceValue = 0 + (int)(Math.random()*6);
	        return m_diceValue;
	    }
	    public int Value(){
	        return m_diceValue;

        }
	}
	


