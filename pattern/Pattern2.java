package pattern;

  /*123456
	23456
	3456    test1()
	456
	56
	6*/

/*111111
  22222        test2()
  3333
  444
  55
  6*/
import java.util.Scanner;

public class Pattern2 {
	
	public static void test1()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void test2()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[])
	{
		Pattern2.test1();
		Pattern2.test2();
	}
}
