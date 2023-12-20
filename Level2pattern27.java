import java.util.Scanner;
class Level2pattern27
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			if(i<=(n+1)/2)	
			{
				for(j=1;j<=i;j++)
					System.out.print("*"+" ");
				System.out.println(" ");
			}
			else if(n%2==0)
			{
				for(j=i+1;j<=n;j++)
					System.out.print("*"+" ");
				System.out.println(" ");
			}
			else
			{
				for(j=i;j<=n;j++)
					System.out.print("*"+" ");
				System.out.println(" ");
			}
		}
	}
}