package CodePractice;

public class PrimeNo {
    public boolean isPrime(int n) {
        boolean flag = false;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

/*class Range {
    public static boolean primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeInRange(i)) {
                System.out.println(i);
            }
        }
        System.out.println();

    }
}*/



