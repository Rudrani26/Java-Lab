import java.util.*;

class hello implements Runnable
{
	public void run(){
	for(int i=0; i<5; i++)
	{
	System.out.println("HELLO WORLD");
	//Thread.sleep(500);
	}
	}
}
class bye implements Runnable
{
	public void run(){
	for(int i=0; i<5; i++)
	{	
	System.out.println("BYE WORLD");
	//Thread.sleep(500);	
	}
	}
}

public class Multithreading
{
	public static void main(String[] args)
	{
	hello h = new hello();
	bye b = new bye();
	Thread t1 = new Thread(h);
	Thread t2 = new Thread(b);
	t1.start();
	t2.start();
	}
}
