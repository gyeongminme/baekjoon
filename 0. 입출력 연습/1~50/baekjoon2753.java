package 백준;

import java.util.Scanner;

public class baekjoon2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if((n%4 == 0 && n%100 !=0 ) || (n%4 == 0 && n%400 ==0) ){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }

    }
}