import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        int c;

        System.out.println("Arithmetic Operators ==>");

        c = a + b;
        System.out.println("Addition= " + c);

        c = a - b;
        System.out.println("Subtraction= " + c);

        c = a * b;
        System.out.println("Product=" + c);

        c = a / b;
        System.out.println("Quotient= " + c);

        c = a % b;
        System.out.println("Remainder= " + c);

        c = 18;
		 System.out.println("let c = " + c);
		

        c++;
        System.out.println("Answer for increment = " + c);

        c--;
        System.out.println("Answer for decrement = " + c);

        System.out.println("\nAssignment Operators ==>");

        c &= a;
        System.out.println("Answer for & = " + c);

        c ^= a;
        System.out.println("Answer for ^ = " + c);

        c |= a;
        System.out.println("Answer for | = " + c);

        a = b;
        System.out.println("a = " + a);

        c = 35;

        c <<= 2;
        System.out.println("Answer for left shift = " + c);

        c >>= 2;
        System.out.println("Answer for right shift = " + c);

        a = 9;
        b = 7;
        c = 8;

        System.out.println("\nBitwise Operators ==>");

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a<<3 = " + (a << 3));
        System.out.println("a>>3 = " + (a >> 3));
        System.out.println("a>>>3 = " + (a >>> 3));

        System.out.println("\nLogical Operators ==>");

        int d;

        System.out.println("AND Operator:");

        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        } else
            System.out.println("False conditions");

        System.out.println("OR Operator:");

        d = 5;

        if (a > b || c == d)
            System.out.println("One or both + the conditions are true");
        else
            System.out.println("Both the + conditions are false");

        System.out.println("NOT Operator:");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

    }
}
