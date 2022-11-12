import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1041 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] arr = new int[6];
        for(int i = 0; i<6; i++) arr[i] = sc.nextInt();
        long xyz = 4;
        long xy = 8 * (n - 2) + 4;
        long x =  5 * (n - 2) * (n - 2) + 4 * (n - 2);
        long ans = 0;


        if(n==1){
            Arrays.sort(arr);
            
            for(int i = 0; i<5; i++) ans +=arr[i];
            System.out.println(ans);
        }else {
            long min = arr[0];
            for(int i = 0; i < 6 ; i ++){
                min = Math.min(min, arr[i]);
            }
            ans += x * min;
         
            min = Long.MAX_VALUE;
            for(int i = 0; i< 6; i++){
                for(int j = i+1; j< 6; j++){
                    if(i+j != 5){
                        min = Math.min(min, arr[i] + arr[j]);
                    }
                }
            }

            ans += xy * min;

            int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += Math.min(arr[i], arr[5 - i]);
			}

			ans += xyz * sum;
            System.out.println(ans);
        }
        
    }
}
