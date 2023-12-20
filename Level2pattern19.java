import java.util.Scanner;
class Level2pattern19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println(" ");
		}
	}	
}