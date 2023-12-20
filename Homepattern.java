import java.util.*;
class Homepattern
{
	public static void main (String args[])
	{	int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=i;j<=5;j++)
				System.out.print("  ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*"+" ");
			System.out.println("");
		}
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=11;j++)
			{
				if(j==1 || j==11 || (j==5 && i>2) || (j==7 && i>2)  || (i==10 && j<=11) || (i==3 && j==6) || ((i==4 || i==7) &&((j>1 && j<4) || (j>8 && j<=11))) || ((j==3 || j==9)  && i>=5 && i<=7))
					System.out.print("*"+" ");
				else 
					System.out.print("  ");
				
			}
			System.out.println(" ");
		}
		
	}
	
}