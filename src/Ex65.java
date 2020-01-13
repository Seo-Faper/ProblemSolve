import java.util.Scanner;

public class Ex65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				dp[i][j] = sc.nextInt();
			}
		}
		dp[1][0] +=dp[0][0];
		dp[1][1] +=dp[0][0];
		for(int i = 2; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				if(j==0) dp[i][j] +=dp[i-1][j];
				else if(j==i) dp[i][j] +=dp[i-1][j-1];
				else dp[i][j] += Math.max(dp[i-1][j-1],dp[i-1][j]);
			}
		}
		int max = 0;
		for(int i = 0; i<n; i++){
			max = Math.max(dp[n-1][i], max);
		}
		System.out.println(max);
	}
}
