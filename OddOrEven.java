//SAC CS112 Introduction to Java Programing
//Implementent class OddOrEven.
/*with 2 Methods.
 * Odd-print a string of "Odd"
 * Even-print a string of "Even"
 * Test your object*/

public class OddOrEven
{
	private String OddOrEven; 
//constructor initializes with String argument
	public OddOrEven( String name )
	{
		OddOrEven = name;
	}//end method 1
	
	public String getCourseName()
	{
		return OddOrEven;
	}//end method 2
	
	public void displayMessage()
	{
System.out.printf( "AddOrEven for\n%s!\n", getCourseName() );
	}//end method displayMessage
}//end class