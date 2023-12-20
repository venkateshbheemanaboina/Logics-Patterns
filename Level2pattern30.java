import java.util.Scanner;
// do it again
class Level2pattern30
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j,c=0;
		for(i=0;i<=n;i++)
		{
				for(j=1;j<=n-i;j++)
					System.out.print("  ");
				for(j=0;j<=i;j++)
				{
					if(i==0 || j ==0)
						c=1;
					else
						c=c*(i-j+1)/j;
					System.out.print(c+"  ");
				}
			System.out.println("  ");
		}
	}
}