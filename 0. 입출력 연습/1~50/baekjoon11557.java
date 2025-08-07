package asd;
import java.util.Scanner;

public class baekjoon11557 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N = 0;
        for(int i = 0 ; i <T ; i++){
            N = scan.nextInt();
            String arr[] = new String[N];
            int ar[] = new int[N];
            int max = 0;
            int index = -1;
            for(int j = 0 ; j<N ;j++){
                arr[j] = scan.next();
                ar[j] = scan.nextInt();
                if(max < ar[j]){
                    max = ar[j];
                    index = j;
                }
            }
            if(index==-1){
                return;
            }
            else {
                System.out.println(arr[index]);
            }
        }

    }
}
