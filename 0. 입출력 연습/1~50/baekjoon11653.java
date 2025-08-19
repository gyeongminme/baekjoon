package 백준;

import java.util.Scanner;

public class baekjoon11653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 2;
        while (N > 1 || a <= N){
            if ( N % a == 0 ){
                N = N / a;

                System.out.println(a);
            }
            else{
                a++;
            }
        }

    }
}
