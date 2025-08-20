package 백준;
import java.util.Scanner;

public class baekjoon1934 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0 ; i<n ; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            if( b > a ){
                int tmp = a;
                a = b;
                b = tmp;
            }

            for(int j = 1 ; j <= b ; j++){
                if (((a * j) % b ) == 0){
                    System.out.println( a * j );
                    break;
                }

            }

        }

    }
}