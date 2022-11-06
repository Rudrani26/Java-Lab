import java.util.*;

public class Arrays
{
	public static void main(String[] args)
	{
		int i,j,row,column;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		row = sc.nextInt();
		System.out.println("Enter columns: ");
		column = sc.nextInt();
		
		int a[][] = new int[row][column];
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.println("Enter elements: ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MATRIX : ");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t" + a[i][j]);
			}
			System.out.println("\n");
		}
		
	}
}
