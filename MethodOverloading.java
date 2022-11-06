/* In method overloading, different methods have same name 
 but different number and type of parameters.
 Return type has to be specified
*/
import java.util.*;

public class MethodOverloading
{
	void add()
	{
		int x = 35;
		int y = 65;
		System.out.println("First Method: " + (x+y));
	}
	
	void add(int x, int y)
	{
		System.out.println("Method Overloading occurs ");
		System.out.println("Second Method: " + (x+y));
	}
	
	void add (double x, double y, double z)
	{
		System.out.println("Third Method: " + (x+y+z));
	}
	
	public static void main(String[] args)
	{
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add(6,5);
		m.add(4.6,9.8,7.2);
	}
}


