import java.util.Scanner;
class Level2Pattern10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j;

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=i;j>=1;j--)
				System.out.print(j);
			System.out.println("");
		}
	}
}