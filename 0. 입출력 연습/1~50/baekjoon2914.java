package 백준;

import java.util.Scanner;

public class baekjoon2914 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a*b - (a-1));
    }
}