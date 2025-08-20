package 백준;

import java.util.Scanner;

public class baekjoon2530 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        b += c ;

        if( b/60 > 0){
            a += b/60;
            b = b % 60;
            if(a/60 > 0){
                z += a/60;
                a %= 60;
                if(z/24 > 0){
                    z %= 24;
                }
            }
        }

        System.out.println(z+" "+a+" "+b);
    }
}