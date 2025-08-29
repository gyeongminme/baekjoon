package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10773 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }
        int check = 0;
        int sum = 0 ;
        for(int i = arr.length-1 ; i>=0 ; i--){


            // 0이 존재하면 count를 높인다 . 그리고 다음으로 continue.
            // 만약 count가 0보다 크고, 0일떄 count ++
            // count가 0보다 크고 0이 아닐 때 count --
            // count가 0이며 , 값이 0이 아닐 때 sum 증가


            if(check == 0){
                if(arr[i] == 0){
                    check++;
                }
                else{
                    sum+= arr[i];
                }

            }
            else{
                if(arr[i] == 0){
                    check++;
                }
                else{
                    check--;
                    continue;
                }            }

        }

        System.out.println(sum);

    }
}