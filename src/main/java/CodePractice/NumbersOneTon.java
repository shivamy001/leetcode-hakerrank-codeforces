package CodePractice;
import java.util.Scanner;
public class NumbersOneTon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        while(count <= n){
            System.out.print(count++ +" ");

        }

    }
}
