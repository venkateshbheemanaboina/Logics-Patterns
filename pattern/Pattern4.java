package pattern;

/**     
  **      test1()
  * *   
  *  *  
  *****  */
/* ***** 
   *  *     test2()
   * *   
   **    
   *     */



import java.util.Scanner;

public class Pattern4 {
	
	public void test1()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==n  || j==i || j==1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println(" ");	
		}
	}
	
	public void test2()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1  || j+i==n+1 || j==1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println(" ");	
		}
	}
	
	public static void main(String args[])
	{
		Pattern4 p=new Pattern4();
		p.test1();
		p.test2();
	}

}
