import java.util.Scanner;

public class baekjoon10811 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //N 입력
        int N = scan.nextInt();

        //바구니
        int arr[] = new int[N];
        for(int i = 0 ; i<N ; i++){
            arr[i] = i+1;
        }

        //바구니 순서를 역순으로 만들기
        int M = scan.nextInt();
        int tmp = 0;

        for(int i = 0 ; i<M ; i++){
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1; // 인덱스 번호용으로 변환

            while(a<b) {
                tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;
                a++;
                b--;
            }

        }


        for(int i = 0 ; i<N ; i++) {
            System.out.print(arr[i]+" ");
        }

        }
}
