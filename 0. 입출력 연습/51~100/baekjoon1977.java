package 백준;
import java.util.Scanner;

public class baekjoon1977 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();


        int min = b + 1;
        int sum = 0;
        for (int start = (int) Math.sqrt(a); start <= (int) Math.sqrt(b); start++) {
            if (a <= start * start && b >= start * start) {
                sum += start * start;
                min = Math.min(start * start, min);
            }

        }

        if (min == b + 1) {
            System.out.println(-1);
        } else {

            System.out.print(sum + "\n" + min);
        }
    }
}