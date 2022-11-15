import java.util.Arrays;
import java.util.Scanner;

public interface BOJ_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[5];
        int arv = 0;
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
            arv +=arr[i];
        } 
        Arrays.sort(arr);
        System.out.println(arv/5);
        System.out.println(arr[2]);
    }
}
