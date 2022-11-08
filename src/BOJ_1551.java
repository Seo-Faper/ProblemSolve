
import java.util.Scanner;

/**
 * BOJ_1551
 */
public class BOJ_1551 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] l = sc.nextLine().split(",");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)arr[i] = Integer.parseInt(l[i]);
        for(int a = 0; a < k; a++){
            for(int i = 0; i<n-1; i++){
                arr[i] = arr[i+1]-arr[i];
            }
        }
        for(int i = 0; i<n-k; i++){
            if(i!=n-k-1)System.out.print(arr[i]+",");
            else System.out.println(arr[i]);
        }
    }    
}