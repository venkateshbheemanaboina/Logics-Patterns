import java.util.Scanner;
class Pattrenprogram
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the N value");
		n=sc.nextInt();
		i=n;
		while(i>=0)
		{
			System.out.println(i+" ");
			i--;
		}
		i=1;
		while(i<=n)
		{
			System.out.println(i+" ");
			i++;
		}
	}
}
