/*
In Contructor overloading, multiple contructors with
different number and type of parameters are present. 
Return type does have to be mentioned.
All the contructors have same name as their class.
*/
import java.util.*;

public class Constructors
{
	Constructors()
	{
		int x = 35;
		int y = 65;
		System.out.println("Default Constructor");
		System.out.println("First Constructor: " + (x+y));
	}
	
	Constructors(int x, int y)
	{
		System.out.println("Parameterized Constructor");
		System.out.println("Constructor Overloading occurs ");
		System.out.println("Second Constructor: " + (x+y));
	}
	
	Constructors (double x, double y, double z)
	{
		System.out.println("Third Constructor: " + (x+y+z));
	}
	
	public static void main(String[] args)
	{
		Constructors c = new Constructors();
		Constructors c1 = new Constructors(6,5);
		Constructors c2 = new Constructors(4.6,9.8,7.2);
	}
}
