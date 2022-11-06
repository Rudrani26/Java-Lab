import java.util.*;

interface A
{
	int a = 55;
	int b = 89;
}
interface B
{
	int c = 25;
	int d = 69;
}
class Imp implements A,B
{
	Imp()
	{
		System.out.println("All the fives " + a);
		System.out.println("All but one " + b);
		System.out.println("Duck and dive at " + c);
		System.out.println("Your place or mine " + d);
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Imp i = new Imp();
	}
}
