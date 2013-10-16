import java.util.Scanner;

public class ReadN {

	public static void main(String[] args) 
	{
	Scanner input = new Scanner( System.in );	
	int	M=1;
	int F=1;
	int N=F*M;
	
	F=F*M;
	
	if (F*M==F)
		System.out.printf("%d == %d\n", M ,F );
	
	if (F*M!=F)
		System.out.printf("%d != %\n", M, F );
	
	System.out.printf( "N = %d\n", N);
	
	input.close();
	}

}
