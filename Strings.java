import java.util.*;

public class Strings
{
	public static void main(String[] args)
	{
		strings1 s = new strings1();
	}
}
class strings1
{
	strings1()
	{
	String str = "Rudrani";
	String str1 = "Chavarkar";
	
	char a[] = {'H','E','L','L','O'};
	String str2 = new String(a);
	
	int len = str.length();
	System.out.println("length is " + len);
	
	int comp = str.compareTo(str1);
	
	if(comp == 0)
	{
		System.out.println("YAY");
	}
	else
	{
		System.out.println("NOT YAY");
	}
	
	System.out.println("Concat gives " + str2.concat(str));
	
	}
}
