package Hackerrank;
import java.util.Scanner;

public class Hackerrank1 {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();
            sc.close();
            if(n%2!=0){
                System.out.println(" weird");}
            else if(n%2==0 && 2<=n && n<=5){
                System.out.println("not weird");}
            else if(n%2==0 && 6<=n && n<=20){
                System.out.println("weird");}
            else {
                System.out.println("not weird");}
        }

    }
