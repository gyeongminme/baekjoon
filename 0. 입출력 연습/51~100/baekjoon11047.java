package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon11047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }


        int sum = 0 ;
        int count = 0;
        int i = arr.length-1;

        while (i >= 0){
            if(arr[i] <= k){
                sum += arr[i] * (k/arr[i]);
                count += k/arr[i];
                k = k%arr[i];
            }
            --i;

        }

        System.out.print(count);

    }

}