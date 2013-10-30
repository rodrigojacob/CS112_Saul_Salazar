/*SAC CS112 Introduction to Java Programming.
Lab2
Extend the Dice class
with a Method
Throw(int bounces)
1 = call random once
2 = call random twice, return average
….
Test the Dice class in the main program.*/

public class Week10Lab2
{
	int value[] = new int[100];
    int arrayCounter=0;
    private int m_total=0;
    int average;
    public int Throw(int bounces){
        for (int i=0; i<bounces;i++){
            value[i] = 0 + (int)(Math.random()*6);
            m_total= m_total +value[i];
        }
        average = m_total/bounces;
        return average;
    }
    public int Value(){
        return average;
    } 
    
}
