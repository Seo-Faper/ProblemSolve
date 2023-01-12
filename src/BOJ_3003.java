import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ans = {1,1,2,2,2,8};
        for(int i = 0; i<6; i++){
            ans[i] -= sc.nextInt();
        }
        for(int i = 0; i<6; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
