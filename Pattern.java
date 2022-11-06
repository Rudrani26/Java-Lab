import java.util.*;

public class Pattern
{
	public static void main(String[] args)
	{
		int i,j,k,row;
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no. of rows: ");
		row = sc.nextInt();
		
		for(i = 0; i<row; i++)
		{
			for(j= 0; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			for(k = 0; k<=i; k++)
			{
			System.out.print(" *");
			}
			System.out.println("\n");
		}
		for(i = 1; i<row; i++)
		{
			for(j = i+1; j>=0; j--)
			{
				System.out.print(" ");
			}
			for(k = row - i - 1;k>=0; k--)
			{
			System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
}
