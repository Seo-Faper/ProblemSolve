import java.util.Scanner;

public class BOJ_1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for(int i = 1; i<n; i++){
            ans+=(long)(n*i+i);
        }
        System.out.println(ans);
    }
}
