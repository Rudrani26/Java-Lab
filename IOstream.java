import java.io.*;

public class IOstream
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader p = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(p);
		
		char c;
		System.out.println("Enter a character: ");
		c = (char)b.read();
		System.out.println(c);
		
		FileInputStream daal = new FileInputStream("idharlikhahai.txt");
		FileOutputStream yele = new FileOutputStream("yehipehai.txt");
		
		int a;
		int k =0;
		while((a = daal.read())!= -1)
		{
			yele.write(a);
			System.out.print((char)a);
			k++;
		}
		System.out.println();
		System.out.println("Characters: " + k);
		
	}
}
