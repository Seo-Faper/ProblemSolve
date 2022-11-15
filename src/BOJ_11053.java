import java.util.Scanner;

public class BOJ_11053{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n+1];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }   
        dp[0] = 1;
        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i-1]){
                dp[i] += dp[i-1] + 1;
            } 
            else dp[i] = dp[i-1];
        }


    }
}
