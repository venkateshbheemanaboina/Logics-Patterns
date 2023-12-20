package pattern;

import java.util.Scanner;

public class Pattern5 {
	
	public static void test1()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<n;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.println(i);
			System.out.println("");
		}
	}
	
	public static void mian(String [] args)
	{
		Pattern5.test1();
	}

}
