import java.util.*;

public class Pascal
{
	public int fact(int x)
	{
		if (x == 0)
		{
			return 1;
		}
		else 
		{
			return x*fact(x-1);
		}
	}
	
	public static void main(String[] args)
	{
		int i,j,row;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		row = sc.nextInt();
		
		Pascal p = new Pascal();
		
		for(i=0; i<row; i++)
		{
			for(j=0; j<=row-i; j++)
			{
				System.out.print("  ");
			}
			for(j=0; j<=i; j++)
			{
			System.out.print("  " + p.fact(i) / (p.fact(i-j) * p.fact(j)));
			}
			System.out.println("\r\n");
		}
	}
}
