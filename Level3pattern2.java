import java.util.Scanner;
// do it again
class Level3pattern2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
				for(j=i;j<n;j++)
					System.out.print("  ");
			
				for(j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				
				}
				
				for(j=i-1;j>0;j--)
				{
					
					System.out.print(j+" ");
					
				}
			System.out.println("  ");
		}
	}
}


// need to solve