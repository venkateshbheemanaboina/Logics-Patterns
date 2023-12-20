import java.util.Scanner;
class Level2pattern21
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
			{
				if( i==1 || i==n || j==1 || j==n || i==j || (i+j==n+1))
					System.out.print("*"+" ");
				else 
					System.out.print("  ");
					
			}
			System.out.println(" ");
		}
	}	
}