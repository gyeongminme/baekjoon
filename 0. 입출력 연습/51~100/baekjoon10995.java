package 백준;

import java.util.Scanner;

public class baekjoon10995 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0 ; i< n ; i++){
            if(i%2==1){
                System.out.print(" ");
            }
            for(int j = 0 ; j < n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}