import java.util.*;

class square 
{
	int side;
	
	void getside(){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the side of square: ");
	side = sc.nextInt();
	}
}
class cube extends square
{
	int area,volume;
	
	void getArea(){
	area = 6*side*side;
	System.out.println("Area of cube: " + area);
	}
	void getVol(){
	volume = side*side*side;
	System.out.println("Volume of cube: " + volume);
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
		cube c = new cube();
		c.getside();
		c.getArea();
		c.getVol();
	}
}
