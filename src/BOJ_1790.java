import java.util.Scanner;

public class BOJ_1790 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int find = 0;
        int stack = 9;
        int len = 1;
        
        while(true){
            if (k <= len*stack) break;
            k -= (len*stack);
            find +=stack;

            len++;
            stack*=10;
        }
        find = (find+1) + (k-1)/len;
        if(find > n) System.out.println(-1);
        else{
            int t = (int)((k-1)%len);
            System.out.println((""+find).charAt(t));
            
        }
    }
}
