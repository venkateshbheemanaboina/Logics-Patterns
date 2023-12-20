package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=i;j<4;j++)
				System.out.print("  ");
			for(j=i;j<=2*i-1;j++)
				System.out.print(j+" ");
			for(k=j-2;k>=i;k--)
				System.out.print(k+" ");
			System.out.println();
		}
	}

}


/*      1 
	  2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
*/