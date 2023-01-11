import java.util.Arrays;
import java.util.Scanner;

class BOJ_4101{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] sel = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(sel[0] == sel[1] && sel[0]==0) break;
            if(sel[0] > sel[1]) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}