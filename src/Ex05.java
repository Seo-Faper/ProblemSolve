import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = new int[n];
		int x1, x2, y1, y2, r1, r2;
		int range;
		for(int i = 0; i<n; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			answer[i] = solve(x1, y1, r1, x2, y2, r2);
			//System.out.println(range);
			
		}
		for(int a : answer) {
			System.out.println(a);
		}
	}
	public static int solve(int x1, int y1, int r1, int x2, int y2, int r2)
    {
        double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        // 6번
        if (x1 == x2 && y1 == y2 && r1 == r2)
            return -1;
        // 1번 5번 7번
        else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 ||  r < Math.abs(r1-r2))
            return 0;
        // 2번 4번
        else if (r == r1 + r2 || Math.abs(r1-r2) == r)
            return 1;
        // 3번
        return 2;
    }
}
