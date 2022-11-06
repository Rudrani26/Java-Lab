import java.util.*;

@SuppressWarnings("unchecked")

public class Vectors
{
	public static void main(String[] args)
	{
		
		
		Vector v = new Vector(100);
		
		System.out.println(v.capacity());
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		System.out.println(v);
		
		for(int i=6; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		v.add(10,20);
		System.out.println(v);
		
		v.add("Hi");
		System.out.println(v);
		v.add("I");
		System.out.println(v);
		v.add("am");
		System.out.println(v);
		v.add("Rudrani");
		System.out.println(v);
		
		
		System.out.println("Element at 7: "+v.elementAt(7));
		System.out.println(v.get(10));
		System.out.println(v.get(11));
		System.out.println(v);
		System.out.println("Capacity: "+v.capacity());
	}
}
