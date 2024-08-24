import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count = 0;
        int Sum=0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num=num/i;
                count++;
                Sum+=i;
            }
        }
        if (count == 1) {
            System.out.println("Prime number"+Sum);

        }
    }
}
