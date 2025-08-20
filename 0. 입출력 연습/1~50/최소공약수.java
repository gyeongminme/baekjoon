package 백준;
import java.util.Scanner;

public class 최소공약수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0 ; i<n ; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            scan.nextLine();

            if( b > a ){
                int tmp = a;
                a = b;
                b = tmp;
            }

            for( int j = b ; j > 0 ; j--){
                if (a % j == 0 && b % j == 0){
                    System.out.println(j);
                    break;
                }
            }

        }

    }
}