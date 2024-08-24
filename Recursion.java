import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(n%2==0)
            {
                sum = sum + n;
            }
        }
        System.out.println("Sum Is:"+sum);
    }
}
