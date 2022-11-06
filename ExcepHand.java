import java.util.*;

public class ExcepHand
{
	public static void main(String[] args)
	{
		int a = 67;
		int b = 0;
		int c[] = {'1','2','3','4','5'};
		
		try{
			int d = a/b;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		try{
			System.out.println("Get me " + c[7]);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
