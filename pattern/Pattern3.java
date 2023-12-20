package pattern;

/*12345
   1234
    123                    test1()
     12
      1*/

/*12345
   2345                    test2()
    345
     45
      5*/


import java.util.Scanner;

public class Pattern3 {
		
		public static void test1()
		{
			Scanner sc = new Scanner(System.in);
			int i,j,n;
			System.out.println("Enter n value");
			n=sc.nextInt();
			for(i=n;i>=1;i--)
			{
				for(j=i;j<n;j++)
					System.out.print(" ");
				for(j=1;j<=i;j++)
					System.out.print(j);
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
				for(j=i;j>=1;j--)
					System.out.print(" ");
				for(j=i;j<=n;j++)
					System.out.print(j);
				System.out.println("");	
			}
		}

		
		public static void main(String args[])
		{
			Pattern3.test1();
			Pattern3.test2();
			
		}
}
