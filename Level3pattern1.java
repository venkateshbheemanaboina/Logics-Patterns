import java.util.Scanner;
// do it again
class Level3pattern1
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
				int k=0;
				for(j=i;k<i;j++)
				{
					System.out.print(j+" ");
					k++;
				}
				int l=j-1;
				for(j=i;j>0;j--)
				{
					
					System.out.print(l+" ");
					l=l-1;
				}
			System.out.println("  ");
		}
	}
}


// need to solve