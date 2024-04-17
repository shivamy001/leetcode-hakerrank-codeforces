package CodePractice;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            System.out.print(rem);
            sum += rem;
        }
        System.out.println(" ");
        System.out.println(sum);


    }
}

