package pattern;

/*11111
  12345
  33333
  12345
  55555*/

import java.util.Scanner;

public class Pattern1 {
	public static void test1()
	{
		Scanner sc= new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{	if(i%2!=0)
					System.out.print(i);
				else
					System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[])
	{
		Pattern1.test1();
	}

}
