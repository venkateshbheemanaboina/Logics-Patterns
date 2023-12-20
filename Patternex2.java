import java.util.Scanner;
class Patternex2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter n value only odd numbers");
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				if(j==1  || i==n  || i==j)
					System.out.print("*");	
				else
					System.out.print(" ");	
		System.out.println(" ");	
		}
	}
}