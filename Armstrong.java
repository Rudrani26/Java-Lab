import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int n, s = 0, a, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        a = n;
        while (n != 0) {
            r = n % 10;
            s = s + (r * r * r);
            n = n / 10;
        }
        if (s == a) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }

    }

}
