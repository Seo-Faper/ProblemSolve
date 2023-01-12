import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        for(int i = 0; i <count; i++){
            total -= sc.nextInt()*sc.nextInt();
        }
        if(total==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
