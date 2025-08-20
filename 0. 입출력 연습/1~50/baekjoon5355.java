package 백준;

import java.util.Scanner;

public class baekjoon5355 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i ++){
            double  a = scan.nextDouble();
            String str = scan.nextLine();
            String str1[] = new String[str.length()];
            str1  = str.split(" ");
            for(int j = 0 ; j < str1.length ; j++){
                switch (str1[j]){
                    case "@" :
                        a*=3;
                        break;
                    case "%":
                        a+=5;
                        break;
                    case "#":
                        a-=7;
                        break;
                    default:
                        break;
                }
            }
            System.out.printf("%.2f \n",a);
        }
    }
}