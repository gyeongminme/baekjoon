package 백준;

import java.util.Scanner;

public class baekjoon2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for( int i = 0 ; i <n ; i++){
            int a = scan.nextInt();
            String str = scan.nextLine();
            str = str.trim();
            for (int j = 0 ; j< str.length() ; j++){
                for(int k = 0 ; k<a ; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}