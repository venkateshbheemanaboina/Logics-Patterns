import java.util.Scanner;
class Level2Pattern14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j,k;

		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(" ");
			for(j=n;j>=i;j--)
				System.out.print(i+" ");
			System.out.println("");
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=i;j<=n;j++)
				System.out.print(" ");
			for(j=i;j>=1;j--)
				System.out.print(i+" ");
			System.out.println(" ");
		}
	}
}