import java.util.Scanner;
class Patternusingfor7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j;

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				if(i%2!=0)
				System.out.print("*");
			else
				System.out.print("#");
			System.out.println("");
		}
	}
}
