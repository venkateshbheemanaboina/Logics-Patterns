import java.util.Scanner;
class Patternex1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter n value only odd numbers");
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=(n+1)/2;i++)
		{	
			if(i<=n/2)
			{
			for(j=1;j<=n/2;j++)
				System.out.print(" ");
			for(j=1;j<=1;j++)
				System.out.print("+");
			System.out.println("");
			}
			else
			{
				for(j=1;j<=n;j++)
					System.out.print("+");
				System.out.println("");
			}
		}
		for(i=1;i<n/2;i++)
		{
			for(j=1;j<=n/2;j++)
				System.out.print(" ");
			for(j=1;j<=1;j++)
				System.out.print("+");
			System.out.println("");
		}	
	}
}