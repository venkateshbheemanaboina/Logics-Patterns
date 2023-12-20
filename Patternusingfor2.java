import java.util.Scanner;
class Patternusingfor2
{
	public static void main(String args[])
	{
		char i,j;
		for(i='Z';i>='A';i--)
		{
			for(j='A';j<=i;j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}
