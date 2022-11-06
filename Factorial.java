import java.util.*;

public class Factorial {
	
    public static void main(String[] args) {
        int n, s = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
		
		System.out.println("\nRecursively : ");
		int Ans = fact(n);
		System.out.println("Factorial is " + Ans);
		
		System.out.println("\nIteratively: ");
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        System.out.println("Factorial is " + s);
    }
    
	public static int fact (int a){
		if (a==0) 
			return 1;
		else 
		 return a*fact(a-1);
	}
  
}
