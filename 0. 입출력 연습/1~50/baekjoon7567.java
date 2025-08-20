package 백준;
import java.util.Scanner;

public class baekjoon7567 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] N = scan.nextLine().split("");

        int sum = 10;

        for(int i = 0 ; i < N.length-1 ; i++){
            if(N[i].equals(N[i+1])){
                sum+=5;
            }
            else{
                sum+=10;
            }
        }

        System.out.print(sum);


    }
}