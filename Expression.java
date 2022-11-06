import java.util.*;
import java.lang.Math;

public class Expression
{
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		System.out.println("Enter c: ");
		c = sc.nextInt();
		
		double root1,root2;
		
		root1 = -b + Math.sqrt((b*b - 4*a*c)/(2*a));
		root2 = -b - Math.sqrt((b*b - 4*a*c)/(2*a));
		
		System.out.println("Root 1: " + root1);
		System.out.println("Root 2: " + root2);
		
	}
}
