import java.util.Scanner;
class Level2Pattern4
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter n value");
		//int n=sc.nextInt();
		char i,j;

		for(i='A';i<='Z';i++)	
		{
			for(j=i;j<'Z';j++)
				System.out.print(" ");
			for(j=i;j>='A';j--)
				System.out.print(j);
		System.out.println("");
		}
	}
}