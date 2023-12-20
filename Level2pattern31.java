import java.util.Scanner;
// do it again
class Level2pattern31
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j,c=0;
		for(i=1;i<=n;i++)
		{
				for(j=i;j<n;j++)
					System.out.print("  ");
				for(j=1;j<=2*i-1;j++)
				{
					if(i==1 || i==n || j==1||j==2*i-1)
						System.out.print("*"+" ");
					else
						System.out.print("  ");
				}
			System.out.println("  ");
		}
	}
}