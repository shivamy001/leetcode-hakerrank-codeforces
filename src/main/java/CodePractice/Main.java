package CodePractice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrimeNo prime = new PrimeNo();
        System.out.println( prime.isPrime(n));

    }
}

