package CodePractice;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n;j++) {
                System.out.print("*");
            }
            System.out.print("\n  ");
        }
    }
}


/*for (i=1; i<=size; i++){
        for (j=1; j<=size; j++){
        System.out.print("*");
  }
          System.out.print("\n");*/