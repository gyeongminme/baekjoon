import java.util.Scanner;

public class baekjoon1789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long v = scan.nextLong();
        long result= 0;

        if(v==1){
            System.out.println(1);
        }
        else{
            for(long i =1 ; i<v+1 ;i++){
                if(v-i<0){
                    break;
                }
                else{
                    v=v-i;
                    result=result+1;
                }

            }

            System.out.println(result);

        }
    }
}