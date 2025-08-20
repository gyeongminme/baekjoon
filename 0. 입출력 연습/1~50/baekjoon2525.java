package 백준;

import java.util.Scanner;

public class baekjoon2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        b += c ;

        if( b/60 > 0){
            a += b/60;
            b = b % 60;
            if(a/24 > 0){
                a %= 24;
            }
        }

        System.out.println(a+" "+b);
    }
}