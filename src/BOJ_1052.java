import java.util.Scanner;

public class BOJ_1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        while(Integer.bitCount(n)>k){
          // System.out.println(n);
           n += Math.pow(2, n & (-n)-1);
           ans++;

        }

        System.out.println(ans);
    }
}
