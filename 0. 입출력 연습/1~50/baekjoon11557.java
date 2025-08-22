package 백준;
import java.util.Scanner;

public class baekjoon11557 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0 ; i < n ; i ++){
            int a = scan.nextInt();
            String[] arr = new String[a];
            int[] intArr = new int[a];

            int max_sul = 0;
            int max = 0;
            for(int j = 0 ; j < a ; j++){
                arr[j] = scan.next();
                intArr[j] = scan.nextInt();

                if ( max_sul < intArr[j]){
                    max_sul = intArr[j];
                    max = j;
                }

            }
            System.out.println(arr[max]);

        }

    }
}