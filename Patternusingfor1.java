import java.util.Scanner;
class Patternusingfor1
{
	public static void main(String args[])
	{
		char i,j;
		for(i='A';i<='Z';i++)
		{
			for(j=i;j>='A';j--)
				System.out.print(j);
			System.out.println("");
		}
	}
}
