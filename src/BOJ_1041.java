import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1041 {
    public static void main(String[] args){
        /*
            (4* xyz + 4*(n-2)*xy + (n-2)^2*x) + (n-1) * (4*xy+4*(n-2)*x)
         * 4개의 3면의 합이 가장 작은 주사위 + 4*(n-2)개의 2면의 합이 가장 작은 주사위 + (n-2)^2개의 1면의 합이 가장 작은 주사위
         * + (n-1) *  ( 4개의 2면의 합이 가장 작은 주사위 + 4*(n-2)개의 1면의 합이 가장 작은 주사위  
         *
         * 즉, 인접한 3면의 합이 가장 작은 값을 찾아내면 됨 
         *     
    +---+        
    | D |        
+---+---+---+---+
| E | A | B | F |
+---+---+---+---+
    | C |        
    +---+         

    에서 E-A-D 가 3면, C-B-F가 3면 이므로, [0,3,4] , [1,2,5] 를 뽑아서 더 작은 값을 구함
    더 작은 값을 구한 후 xyz , xy, x 를 구해서 위의 수식에 대입 (단, n >= 2)
    n == 2 일 때는 xyz * 4 + xy * 2 

    수식을 정리하면 xyz = 4;
    xy =  8 * 8 * (N - 2) + 4;
    x = 5 * (N - 2) * (N - 2) + 4 * (N - 2);
         */
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
